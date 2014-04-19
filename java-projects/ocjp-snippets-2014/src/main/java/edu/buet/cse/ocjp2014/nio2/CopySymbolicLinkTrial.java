package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Copy a symbolic link
 * 
 * @author shamim
 */
public class CopySymbolicLinkTrial {
  public static void main(String... args) {
    Path p1 = Paths.get("/home/shamim/personal/temp/mylink");
    Path p2 = Paths.get("/home/shamim/personal/temp/mylink2");
    
    try {
      Files.copy(p1, p2, LinkOption.NOFOLLOW_LINKS);
      System.out.println("Copy operation was successful");
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
