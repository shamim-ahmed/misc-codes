package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author shamim
 */
public class PathTrial6 {
  public static void main(String... args) {
    Path path = Paths.get("hello.txt");
    System.out.println(path.toAbsolutePath());
  }
}
