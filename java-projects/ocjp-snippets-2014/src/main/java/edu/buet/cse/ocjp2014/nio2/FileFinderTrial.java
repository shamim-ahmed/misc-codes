package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * An example of finding a file using a pattern
 * 
 * @author shamim
 * 
 */
public class FileFinderTrial {
  public static void main(String... args) {
    Path source = Paths.get("/home/shamim/personal/temp/ocjp-source");
    String pattern = "glob:*Example\\.java";
    FileVisitor<Path> visitor = new CustomFileVisitor(pattern);

    try {
      Files.walkFileTree(source, visitor);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }

  private static class CustomFileVisitor extends SimpleFileVisitor<Path> {
    private final PathMatcher pathMatcher;

    public CustomFileVisitor(String pattern) {
      pathMatcher = FileSystems.getDefault().getPathMatcher(pattern);
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) {
      find(path);
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
      find(path);
      return FileVisitResult.CONTINUE;
    }

    private void find(Path path) {
      Path name = path.getFileName();

      if (pathMatcher.matches(name)) {
        System.out.println(path.toAbsolutePath());
      }
    }
  }
}
