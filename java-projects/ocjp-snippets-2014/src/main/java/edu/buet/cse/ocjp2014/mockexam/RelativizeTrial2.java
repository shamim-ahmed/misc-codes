package edu.buet.cse.ocjp2014.mockexam;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * An example of using relativize() method of Path class
 * 
 * @author shamim
 * 
 */
public class RelativizeTrial2 {
  public static void main(String... args) {
    Path path1 = Paths.get("foo/bar");
    Path path2 = Paths.get("dime.txt");
    System.out.println(path1.relativize(path2));
  }
}
