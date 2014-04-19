package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Read the contents of a file as an array of bytes
 *
 * @author shamim
 */
public class FileContentTrial {

  public static void main(String... args) {
    Path path = Paths.get("/home", "shamim", "personal", "temp", "hello.txt");

    try {
      byte[] content = Files.readAllBytes(path);
      System.out.println(new String(content));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
