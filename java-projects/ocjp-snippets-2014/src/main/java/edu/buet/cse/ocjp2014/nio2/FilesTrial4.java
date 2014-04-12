package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * What happens if you try to move a non-empty directory ? Everything works fine !
 * @author shamim
 */
public class FilesTrial4 {
  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/nio2");
    Path target = Paths.get("/home/shamim/personal/temp/nio3");
    
    try {
      Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("move was successful");
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
