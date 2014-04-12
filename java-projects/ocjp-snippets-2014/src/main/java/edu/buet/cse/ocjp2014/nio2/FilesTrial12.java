package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Determine if a Path points to a regular file or a symbolic link
 *
 * @author shamim
 */
public class FilesTrial12 {

  public static void main(String... args) {
    Path path1 = Paths.get("/usr/lib/jvm/jdk1.7.0_45/bin/java");
    Path path2 = Paths.get("/usr/lib/jvm/default-java");
    
    System.out.printf("Is %s a regular file ? %b%n", path1, Files.isRegularFile(path1, LinkOption.NOFOLLOW_LINKS));
    System.out.printf("Is %s a symbolic link ? %b%n", path2, Files.isSymbolicLink(path2));
  }
}
