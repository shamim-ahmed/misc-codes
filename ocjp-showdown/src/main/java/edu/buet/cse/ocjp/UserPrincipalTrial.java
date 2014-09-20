package edu.buet.cse.ocjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

/**
 *
 * @author shamim
 */
public class UserPrincipalTrial {
  public static void main(String... args) {
    try {
      Path p = Paths.get("/home/shamim/personal/temp/hello.txt");
      UserPrincipal user = p.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("shamim");
      Files.setOwner(p, user);
      System.out.printf("The owner of %s is now %s%n", p, user);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
