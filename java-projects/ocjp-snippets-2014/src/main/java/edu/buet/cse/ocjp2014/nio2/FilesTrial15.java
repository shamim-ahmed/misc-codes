package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Getting last modified time of a file
 *
 * @author shamim
 */
public class FilesTrial15 {

  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/hello.txt");

    try {
      System.out.printf("The file %s was last modified on %s%n", path, Files.getLastModifiedTime(path, LinkOption.NOFOLLOW_LINKS));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
