package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/scjp-file-test/dump.sql");
    
    try {
      Files.walkFileTree(path, new CustomFileVisitor());
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
  
  static class CustomFileVisitor implements FileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
      System.out.printf("preparing to visit directory: %s%n", dir);
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      System.out.printf("visiting file: %s%n", file);
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
      System.out.printf("finished visiting directory: %s%n", dir);
      return FileVisitResult.CONTINUE;
    }
  }
}
