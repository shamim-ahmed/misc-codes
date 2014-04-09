package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of using toRealPath() for a Path that does not exist
 *
 * @author shamim
 */
public class PathTrial11 {

  public static void main(String... args) {
    Path path = Paths.get("hello.txt");

    try {
      System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
