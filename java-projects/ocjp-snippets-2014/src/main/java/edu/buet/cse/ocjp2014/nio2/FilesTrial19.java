package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Set the last modified time of a file
 * @author shamim
 *
 */
public class FilesTrial19 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/data.sql"); 
    FileTime time = FileTime.from(new Date().getTime(), TimeUnit.MILLISECONDS);
    
    try {
      Files.setLastModifiedTime(path, time);
      System.out.printf("The last modified time of the file %s was changed to %s%n", path, new Date(time.toMillis()));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
