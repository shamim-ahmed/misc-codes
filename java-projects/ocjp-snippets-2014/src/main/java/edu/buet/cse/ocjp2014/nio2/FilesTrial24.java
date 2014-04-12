package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * An example of moving a directory with files in it
 * 
 * @author shamim
 * 
 */
public class FilesTrial24 {
  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/scjp");
    Path target = Paths.get("/home/shamim/personal/temp/ocjp");

    try {
      Files.move(source, target, LinkOption.NOFOLLOW_LINKS);
      System.out.printf("The file %s has been moved to %s%n", source, target);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
