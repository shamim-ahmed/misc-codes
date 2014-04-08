package edu.buet.cse.ocjp2014.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of Path comparison
 * @author shamim
 */
public class PathTrial5 {
  public static void main(String... args) {
    Path path1 = Paths.get("/home/shamim/personal/temp");
    Path path2 = Paths.get("/home/shamim/personal/../personal/temp");
    
    System.out.println(path1.compareTo(path2));
    System.out.println(path1.normalize().compareTo(path2.normalize()));
  }
}
