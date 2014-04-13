package edu.buet.cse.ocjp.practice01.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Date;

/**
 * Set an attribute
 * 
 * @author shamim
 * 
 */
public class AttributeTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/hello.txt");

    try {
      FileTime time = FileTime.fromMillis(new Date().getTime());
      Files.setAttribute(path, "basic:lastModifiedTime", time, LinkOption.NOFOLLOW_LINKS);
      System.out.printf("Last modified time of %s is now set to %d%n", path, time.toMillis());
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
