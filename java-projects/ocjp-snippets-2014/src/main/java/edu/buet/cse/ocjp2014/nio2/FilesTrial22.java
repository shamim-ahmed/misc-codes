package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Example of retrieving file attributes without using FileAttributesView
 * directly
 * 
 * @author shamim
 * 
 */
public class FilesTrial22 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/data.sql");

    try {
      FileTime creationTime = (FileTime) Files.getAttribute(path, "basic:creationTime", LinkOption.NOFOLLOW_LINKS);
      FileTime lastModifiedTime = (FileTime) Files.getAttribute(path, "basic:lastModifiedTime",
          LinkOption.NOFOLLOW_LINKS);
      FileTime lastAccessTime = (FileTime) Files.getAttribute(path, "basic:lastAccessTime", LinkOption.NOFOLLOW_LINKS);
      UserPrincipal owner = (UserPrincipal) Files.getAttribute(path, "posix:owner", LinkOption.NOFOLLOW_LINKS);
      GroupPrincipal group = (GroupPrincipal) Files.getAttribute(path, "posix:group", LinkOption.NOFOLLOW_LINKS);

      System.out.printf("creationTime = %s%n", new Date(creationTime.to(TimeUnit.MILLISECONDS)));
      System.out.printf("lastModifiedTime = %s%n", new Date(lastModifiedTime.to(TimeUnit.MILLISECONDS)));
      System.out.printf("lastAccessTime = %s%n", new Date(lastAccessTime.to(TimeUnit.MILLISECONDS)));
      System.out.printf("owner = %s%n", owner.getName());
      System.out.printf("group = %s%n", group.getName());
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
