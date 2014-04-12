package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of creating a directory
 * @author shamim
 */
public class FilesTrial6 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/nio-trial");
    
    try {
      Files.createDirectory(path);
      System.out.printf("The directory %s was created successfully%n", path);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
