package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of creating a temporary directory
 * @author shamim
 */
public class FilesTrial9 {
  public static void main(String... args) {
    Path path = Paths.get("/tmp");
    
    try {
      Path resultPath = Files.createTempDirectory(path, "shamim");
      System.out.printf("The temp directory %s has been created%n", resultPath);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
