package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Find if a file is hidden
 *
 * @author shamim
 */
public class FilesTrial13 {

  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/.bashrc");

    try {
      System.out.printf("Is %s hidden ? %b%n", path, Files.isHidden(path));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
