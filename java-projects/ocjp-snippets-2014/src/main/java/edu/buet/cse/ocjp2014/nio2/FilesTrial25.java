package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author shamim
 *
 */
public class FilesTrial25 {
  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/ocjp");
    Path target = Paths.get("/home/shamim/personal/temp/ocjp2");
    
    try {
      Files.copy(source, target);
      System.out.printf("The directory %s has been copied to %s%n", source, target);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
