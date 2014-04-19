package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author shamim
 */
public class CopySymbolicLinkTrial2 {
  public static void main(String... args) {
    Path path1 = FileSystems.getDefault().getPath("/home/shamim", "personal/temp/mylink");
    Path path2 = Paths.get("/home/shamim/personal/temp/mylink3");
    
    try {
      Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("Copy operation was successful");
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
