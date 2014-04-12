package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * An example of copying a file with overwrite option
 * 
 * @author shamim
 *
 */
public class FilesTrial16 {
  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/hello.txt");
    Path target = Paths.get("/home/shamim/personal/temp/hello2.txt");
    
    try {
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
      System.out.printf("File %s was copied successfully to %s%n", source, target);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
