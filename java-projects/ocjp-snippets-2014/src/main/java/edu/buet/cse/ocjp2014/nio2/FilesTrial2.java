package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * An example of copying a file
 * @author shamim
 */
public class FilesTrial2 {

  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/nio2/pom.xml");
    Path destination = Paths.get("/home/shamim/personal/temp/nio2/pom2.xml");

    try {
      Files.copy(source, destination);
      System.out.println("Copy operation was successful");
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
