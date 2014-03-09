package edu.buet.cse.ocjp2014;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompareTrial {
  public static void main(String... args) {
    Path path1 = Paths.get("/home/shamim/personal/temp");
    Path path2 = Paths.get("/home/shamim/applications/../personal/temp");
    
    System.out.println(path1.equals(path2));
    System.out.println(path1.compareTo(path2));
    System.out.println(path1.compareTo(path2.normalize()));
  }
}
