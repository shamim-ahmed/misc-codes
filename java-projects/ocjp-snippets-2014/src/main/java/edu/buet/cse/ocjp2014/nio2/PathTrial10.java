package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of using toRealPath() with a file that exists
 * @author shamim
 */
public class PathTrial10 {

  public static void main(String... args) {
    Path path = Paths.get("src/main/java/edu/buet/cse/ocjp2014/nio2/PathTrial10.java");

    try {
      System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
