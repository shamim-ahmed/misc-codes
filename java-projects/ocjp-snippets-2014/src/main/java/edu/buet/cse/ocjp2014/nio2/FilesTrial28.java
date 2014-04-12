package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of deleting a file
 * 
 * @author shamim
 * 
 */
public class FilesTrial28 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/hello2.txt");

    try {
      Files.delete(path);
      System.out.printf("The file %s was deleted successfully%n", path);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
