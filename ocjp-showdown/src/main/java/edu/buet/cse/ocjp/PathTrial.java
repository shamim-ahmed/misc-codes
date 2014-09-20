package edu.buet.cse.ocjp;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author shamim
 */
public class PathTrial {
  public static void main(String... args) {
    Path p1 = Paths.get("/photos/vacation");
    Path p2 = Paths.get("/yellowstone");
    
    System.out.println(p1.resolve(p2));
    System.out.println(p1.relativize(p2));
  }
}
