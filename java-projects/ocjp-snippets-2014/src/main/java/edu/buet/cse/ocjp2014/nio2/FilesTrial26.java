package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Copying a symbolic link
 * 
 * @author shamim
 * 
 */
public class FilesTrial26 {
  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/symlink");
    Path target = Paths.get("/home/shamim/personal/temp/symlink2");

    try {
      Files.copy(source, target);
      System.out.println("copy operation successful");
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
