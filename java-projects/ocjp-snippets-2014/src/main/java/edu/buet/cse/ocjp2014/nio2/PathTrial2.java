package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demonstrates the use of resolve method
 * @author shamim
 */
public class PathTrial2 {
  public static void main(String... args) {
    Path path1 = Paths.get("/home/shamim/personal/temp");
    Path path2 = Paths.get("pom.xml");
    System.out.println(path1.resolve(path2));
    System.out.println(path2.resolve(path1));
    System.out.println(path1.resolve("archive.zip"));
  }
}
