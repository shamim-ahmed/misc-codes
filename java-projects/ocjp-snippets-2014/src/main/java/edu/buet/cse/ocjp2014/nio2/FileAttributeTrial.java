package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class FileAttributeTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp");
    Path path2 = path.resolve("scjp-file-test");

    try {
      BasicFileAttributes basicAttributes = Files.readAttributes(path2, BasicFileAttributes.class);

      System.out.printf("isDirectory: %b%n", basicAttributes.isDirectory());
      System.out.printf("isRegularFile: %b%n", basicAttributes.isRegularFile());
      System.out.printf("isSymbolicLink: %b%n", basicAttributes.isSymbolicLink());
      System.out.printf("isOther: %b%n", basicAttributes.isSymbolicLink());
      System.out.printf("size: %d%n", basicAttributes.size());
      System.out.printf("creationTime: %s%n", basicAttributes.creationTime());
      System.out.printf("lastAccessTime: %s%n", basicAttributes.lastAccessTime());
      System.out.printf("lastModificationTime: %s%n", basicAttributes.lastModifiedTime());

      DosFileAttributes dosAttributes = Files.readAttributes(path2, DosFileAttributes.class);
      System.out.printf("isHidden: %b%n", dosAttributes.isHidden());
      System.out.printf("isSystem: %b%n", dosAttributes.isSystem());
      System.out.printf("isArchive: %b%n", dosAttributes.isArchive());
      System.out.printf("isReadOnly: %b%n", dosAttributes.isReadOnly());

      PosixFileAttributes posixAttributes = Files.readAttributes(path2, PosixFileAttributes.class);
      System.out.printf("owner: %s%n", posixAttributes.owner().getName());
      System.out.printf("group: %s%n", posixAttributes.group().getName());
      System.out.printf("permissions: %s%n", posixAttributes.permissions());
    } catch (IOException ex) {
      System.out.println(ex);
    }
  }
}
