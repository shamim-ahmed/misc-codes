package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Date;

/**
 * Example of retrieving attributes of a file via FileAttributeView
 * 
 * @author shamim
 * 
 */
public class FilesTrial21 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/data.sql");

    try {
      PosixFileAttributeView attributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class,
          LinkOption.NOFOLLOW_LINKS);
      PosixFileAttributes attributes = attributeView.readAttributes();
      System.out.printf("group = %s%n", attributes.group());
      System.out.printf("owner = %s%n", attributes.owner());
      System.out.printf("isDirectory = %b%n", attributes.isDirectory());
      System.out.printf("isRegularFile = %b%n", attributes.isRegularFile());
      System.out.printf("isSymbolicLink = %b%n", attributes.isSymbolicLink());
      System.out.printf("size = %d bytes%n", attributes.size());
      System.out.printf("creationTime = %s%n", new Date(attributes.creationTime().toMillis()));
      System.out.printf("lastAccessedTime = %s%n", new Date(attributes.lastAccessTime().toMillis()));
      System.out.printf("lastModifiedTime = %s%n", new Date(attributes.lastModifiedTime().toMillis()));
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
