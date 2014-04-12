package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

/**
 * Finding the owner of a file
 * 
 * @author shamim
 * 
 */
public class FilesTrial18 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/data.sql");

    try {
      UserPrincipal user = Files.getOwner(path, LinkOption.NOFOLLOW_LINKS);
      System.out.printf("The owner of the file %s is %s%n", path, user.getName());
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
