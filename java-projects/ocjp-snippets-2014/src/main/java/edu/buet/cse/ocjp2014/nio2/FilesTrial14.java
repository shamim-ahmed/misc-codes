package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of finding the size of a file
 *
 * @author shamim
 */
public class FilesTrial14 {

  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/hello.txt");

    try {
      System.out.printf("The size of %s is %d bytes%n", path, Files.size(path));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
