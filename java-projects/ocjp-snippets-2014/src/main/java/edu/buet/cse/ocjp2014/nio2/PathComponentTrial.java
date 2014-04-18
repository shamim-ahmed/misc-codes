package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author shamim
 */
public class PathComponentTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp");
    System.out.println("root: " + path.getRoot());
    System.out.println("getName(0): " + path.getName(0));
    System.out.println("nameCount: " + path.getNameCount());
  }
}
