package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * An example of moving a file 
 * 
 * @author shamim
 *
 */
public class FilesTrial17 {
  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/dump.sql");
    Path target = Paths.get("/home/shamim/personal/temp/data.sql");
    
    try {
      Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
      System.out.printf("The file %s was successfully moved to %s%n", source, target);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
