package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
 
/**
 * Check for file existence
 * @author shamim
 */
public class FilesTrial11 {
  public static void main(String... args) {
    Path path1 = Paths.get("/home/shamim/personal/temp");
    System.out.printf("%s exists ? %b%n", path1, Files.exists(path1, LinkOption.NOFOLLOW_LINKS));
    
    Path path2 = path1.resolve("foobar");
    System.out.printf("%s exists ? %b%n", path2, Files.exists(path2, LinkOption.NOFOLLOW_LINKS));
  }
}
