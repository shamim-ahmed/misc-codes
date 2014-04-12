package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example that demonstrates when getRoot() and getParent() will return null
 * @author shamim
 */
public class PathTrial7 {
  public static void main(String... args) {
    Path path = Paths.get("hello.txt");
    System.out.println("root: " + path.getRoot());
    System.out.println("parent: " + path.getParent());
  }
}
