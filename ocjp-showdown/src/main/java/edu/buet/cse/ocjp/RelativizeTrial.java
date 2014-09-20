package edu.buet.cse.ocjp;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author shamim
 */
public class RelativizeTrial {
  public static void main(String... args) {
    Path path1 = Paths.get("/home/shamim/personal/temp");
    Path path2 = Paths.get("test.txt");
    
    System.out.println(path2.relativize(path1));
  }
}
