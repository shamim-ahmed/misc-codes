package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

/**
 * Example of watching a directory for change
 * 
 * @author shamim
 * 
 */
public class FileWatcherTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp");
    try {
      WatchService watcher = path.getFileSystem().newWatchService();
      path.register(watcher, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_CREATE,
          StandardWatchEventKinds.ENTRY_DELETE);

      while (true) {
        WatchKey key = watcher.take();
        List<WatchEvent<?>> events = key.pollEvents();

        for (WatchEvent<?> event : events) {
          switch (event.kind().name()) {
            case "ENTRY_CREATE":
              System.out.printf("%s was created%n", event.context());
              break;
            case "ENTRY_DELETE":
              System.out.printf("%s was deleted%n", event.context());
            case "ENTRY_MODIFY":
              System.out.printf("%s was modified%n", event.context());
              break;
            default:
              throw new AssertionError();
          }
        }
        
        // If you forget this, no subsequent events will be received !!
        key.reset();
      }
    } catch (IOException | InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
