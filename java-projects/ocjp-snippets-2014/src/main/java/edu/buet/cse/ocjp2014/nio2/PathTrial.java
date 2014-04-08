package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author shamim
 */
public class PathTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/../personal/temp");
    System.out.println("isAbsolute: " + path.isAbsolute());
    System.out.println("getRoot: " + path.getRoot());
    System.out.println("getNameCount: " + path.getNameCount());
    System.out.println("getParent: " + path.getParent());
    System.out.println("getName(0): " + path.getName(0));
    System.out.println("normalize: " + path.normalize());
  }
}
