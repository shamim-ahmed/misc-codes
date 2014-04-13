package edu.buet.cse.ocjp2014.mockexam;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Trying out a complex Glob pattern
 * 
 * @author shamim
 * 
 */
public class GlobTrial {
  public static void main(String... args) {
    Path start = Paths.get("/home/shamim/personal/temp");

    try {
      Files.walkFileTree(start, new FileFinder());
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }

  private static class FileFinder extends SimpleFileVisitor<Path> {
    private final PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:*.{pdf,rtf}");

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
      Path fileName = path.getFileName();

      if (pathMatcher.matches(fileName)) {
        System.out.println(path.toAbsolutePath().toString());
      }

      return FileVisitResult.CONTINUE;
    }

  }
}
