package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Create multiple directories specified in a path
 * @author shamim
 */
public class FilesTrial7 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/nio5/nio6/nio7");
    
    try {
      Files.createDirectories(path);
      System.out.printf("All the directories in the path %s have been created%n", path);
    } catch (IOException ex) {
      ex.printStackTrace(System.out);
    }
  }
}
