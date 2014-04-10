package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of creating a temporary file
 *
 * @author shamim
 */
public class FilesTrial8 {

  public static void main(String... args) {
    Path path = Paths.get("/tmp");

    try {
      Path resultPath = Files.createTempFile(path, "shamim", "ahmed");
      System.out.printf("The temporary file %s has been created successfully%n", resultPath);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
