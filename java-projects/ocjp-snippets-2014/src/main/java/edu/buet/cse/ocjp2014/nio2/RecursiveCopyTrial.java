package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * An example of implementing recursive copy using nio API
 * 
 * @author shamim
 * 
 */
public class RecursiveCopyTrial {
  public static void main(String... args) {
    Path sourceDir = Paths.get("/home/shamim/personal/temp/ocjp-source");
    Path targetDir = Paths.get("/home/shamim/personal/temp/copied-source");

    try {
      Files.walkFileTree(sourceDir, new CustomFileVisitor(sourceDir, targetDir));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }

  private static class CustomFileVisitor extends SimpleFileVisitor<Path> {
    private final Path sourceDir;
    private final Path targetDir;

    public CustomFileVisitor(Path sourceDir, Path targetDir) {
      this.sourceDir = sourceDir;
      this.targetDir = targetDir;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path currentDir, BasicFileAttributes attrs) {
      try {
        if (Files.isSameFile(sourceDir, currentDir)) {
          Files.createDirectory(targetDir);
        } else {
          int m = sourceDir.getNameCount();
          int n = currentDir.getNameCount();
          
          Path relativePath = currentDir.subpath(m, n);
          Path newDirPath = targetDir.resolve(relativePath);
          Files.createDirectory(newDirPath);
        }
      } catch (IOException ex) {
        ex.printStackTrace(System.err);
        return FileVisitResult.TERMINATE;
      }

      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path sourceFilePath, BasicFileAttributes attrs) {
      int m = sourceDir.getNameCount();
      int n = sourceFilePath.getNameCount();
      Path subPath = sourceFilePath.subpath(m, n);
      Path targetFilePath = targetDir.resolve(subPath);

      try {
        Files.copy(sourceFilePath, targetFilePath);
      } catch (IOException ex) {
        ex.printStackTrace(System.err);
        return FileVisitResult.TERMINATE;
      }

      return FileVisitResult.CONTINUE;
    }
  }
}
