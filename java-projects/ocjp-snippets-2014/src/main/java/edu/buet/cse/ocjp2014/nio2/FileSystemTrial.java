package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/**
 * Accessing basic properties of a FileSystem
 * 
 * @author shamim
 * 
 */
public class FileSystemTrial {
  public static void main(String... args) {
    FileSystem fileSystem = FileSystems.getDefault();
    System.out.printf("separator = %s%n", fileSystem.getSeparator());
    System.out.println("File stores: ");

    for (FileStore store : fileSystem.getFileStores()) {
      try {
        System.out.printf("name = %s%n", store.name());
        System.out.printf("type = %s%n", store.type());
        System.out.printf("total space = %d%n", store.getTotalSpace());
        System.out.println();
      } catch (IOException ex) {
        ex.printStackTrace(System.err);
      }
    }
  }
}
