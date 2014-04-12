package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * An example of retrieving specific attributes related to a file
 * 
 * @author shamim
 *
 */
public class FilesTrial20 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/data.sql");
    
    try {
      Integer uid = (Integer) Files.getAttribute(path, "unix:uid", LinkOption.NOFOLLOW_LINKS);
      System.out.printf("uid = %d%n", uid);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
