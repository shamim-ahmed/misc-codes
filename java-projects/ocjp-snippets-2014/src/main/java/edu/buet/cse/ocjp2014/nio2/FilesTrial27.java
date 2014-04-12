package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of moving a symbolic link
 * 
 * @author shamim
 * 
 */
public class FilesTrial27 {
  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/symlink");
    Path target = Paths.get("/home/shamim/personal/temp/symlink3");

    try {
      Files.move(source, target);
      System.out.println("move operation successful");
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
