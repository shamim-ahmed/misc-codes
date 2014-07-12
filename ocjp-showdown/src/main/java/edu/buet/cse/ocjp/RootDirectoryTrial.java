package edu.buet.cse.ocjp;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author shamim
 */
public class RootDirectoryTrial {
  public static void main(String... args) {
    Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();
    
    for (Path root : roots) {
      System.out.println(root);
    }
  }
}
