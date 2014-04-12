package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Example of visiting a file and tweaking the FileVisitor logic to skip certain
 * directories
 * 
 * @author shamim
 * 
 */
public class FileVisitorTrial3 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp");

    try {
      Files.walkFileTree(path, new CustomFileVisitor());
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }

  private static class CustomFileVisitor extends SimpleFileVisitor<Path> {
    private static final String SPECIAL_DIR_NAME = "ocjp-source";

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
      if (dir.getFileName().toString().equals(SPECIAL_DIR_NAME)) {
        System.out.printf("%nSkipping directory: %s%n", dir);
        return FileVisitResult.SKIP_SUBTREE;
      }

      System.out.printf("%nEntering directory: %s%n", dir);
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException ex) {
      System.out.printf("Exiting directory: %s%n", dir);
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      System.out.printf("Visiting file %s%n", file);
      return FileVisitResult.CONTINUE;
    }
  }
}
