package edu.buet.cse.scjp2014.misc;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author shamim
 */
public class App {
  public static void main(String... args) {
    Path dirPath = Paths.get("/home/shamim", "personal/temp");
    
    try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath, "*.{txt,html}")) {
      for (Path p : dirStream) {
        System.out.println(p.getFileName());
      }
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
