package edu.buet.cse.ocjp;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author shamim
 */
public class DirectoryStreamTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp");
    
    try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(path, "*.txt")) {
      for (Path p : dirStream) {
        System.out.println(p.getFileName());
      }
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
