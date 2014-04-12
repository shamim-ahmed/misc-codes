package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Checking if two paths point to the same file
 *
 * @author shamim
 */
public class FilesTrial10 {

  public static void main(String... args) {
    Path path1 = Paths.get("/home/shamim/personal/temp");
    Path path2 = Paths.get("/home/shamim/personal/../personal/temp");

    System.out.println("equals: " + path1.equals(path2));

    try {
      System.out.println("isSameFile: " + Files.isSameFile(path1, path2));
    } catch (IOException ex) {
      ex.printStackTrace(System.out);
    }
  }
}
