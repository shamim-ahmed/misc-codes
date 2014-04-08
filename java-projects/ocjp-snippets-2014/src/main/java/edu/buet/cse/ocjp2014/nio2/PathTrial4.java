package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example on how to iterate over a Path
 * @author shamim
 */
public class PathTrial4 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp");
    
    for (Path p : path) {
      System.out.println(p);
    }
  }
}
