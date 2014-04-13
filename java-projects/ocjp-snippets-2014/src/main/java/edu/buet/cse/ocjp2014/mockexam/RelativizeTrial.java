package edu.buet.cse.ocjp2014.mockexam;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * An example of using relativize() method of Path class
 * 
 * @author shamim
 *
 */
public class RelativizeTrial {
  public static void main(String... args) {
    Path path1 = Paths.get("/home/shamim/personal");
    Path path2 = Paths.get("/home/shamim/personal/temp/mysql/script.sql");
    System.out.println(path1.relativize(path2));
  }
}
