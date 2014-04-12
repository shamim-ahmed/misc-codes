package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of toAbsolutePath
 * @author shamim
 */
public class PathTrial3 {
  public static void main(String... args) {
    Path path = Paths.get("pom.xml");
    System.out.println(path.toAbsolutePath());
  }
}
