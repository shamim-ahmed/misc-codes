package edu.buet.cse.ocjp;

import java.io.File;

/**
 *
 * @author shamim
 */
public class RootDirectoryTrial2 {
  public static void main(String... args) {
    File[] roots = File.listRoots();
    
    for (File root : roots) {
      System.out.println(root);
    }
  }
}
