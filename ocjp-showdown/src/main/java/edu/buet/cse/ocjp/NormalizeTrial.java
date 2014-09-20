package edu.buet.cse.ocjp;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author shamim
 */
public class NormalizeTrial {
  public static void main(String... args) {
    Path path = Paths.get("./test.txt");
    System.out.println(path.normalize());
    System.out.println(path.toAbsolutePath());
  }
}
