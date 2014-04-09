package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Read permissions
 * @author shamim
 */
public class FilesTrial {
  public static void main(String... args) {
    Path path = Paths.get("/bin");
    System.out.println("isReadable: " + Files.isReadable(path));
    System.out.println("isWritable: " + Files.isWritable(path));
    System.out.println("isExecutable: " + Files.isExecutable(path));
  }
}
