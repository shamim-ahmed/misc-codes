package edu.buet.cse.ocjp;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

/**
 *
 * @author shamim
 */
public class WatchServiceTrial {

  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/ocjp-source");

    try (WatchService watcher = FileSystems.getDefault().newWatchService()) {
      path.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);

      while (true) {
        WatchKey key = watcher.poll();

        if (key != null) {
          List<WatchEvent<?>> events = key.pollEvents();
          
          for (WatchEvent<?> event : events) {
            WatchEvent<Path> pathEvent = (WatchEvent<Path>) event;
            System.out.println(pathEvent.context().getFileName());
          }

          boolean flag = key.reset();

          if (!flag) {
            break;
          }
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
