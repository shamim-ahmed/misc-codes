package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Example of setting a file attribute
 * 
 * @author shamim
 * 
 */
public class FilesTrial23 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/data.sql");
    FileTime time = FileTime.fromMillis(new Date().getTime());

    try {
      Files.setAttribute(path, "basic:lastAccessTime", time, LinkOption.NOFOLLOW_LINKS);
      FileTime newTime = (FileTime) Files.getAttribute(path, "basic:lastAccessTime", LinkOption.NOFOLLOW_LINKS);
      System.out.printf("The lastAccessTime of %s is: %s%n", path, new Date(newTime.to(TimeUnit.MILLISECONDS)));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
