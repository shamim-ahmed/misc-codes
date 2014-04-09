package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * An example of renaming (i.e. moving) a file
 *
 * @author shamim
 */
public class FilesTrial3 {

  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/nio2/pom.xml");
    Path destination = Paths.get("/home/shamim/personal/temp/nio2/mop.xml");

    try {
      Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("move operation successful");
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
