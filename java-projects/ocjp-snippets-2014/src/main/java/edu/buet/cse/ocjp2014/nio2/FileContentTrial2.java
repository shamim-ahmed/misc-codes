package edu.buet.cse.ocjp2014.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example on how to read file content using the methods available in Files class
 *
 * @author shamim
 */
public class FileContentTrial2 {

  public static void main(String... args) {
    Path path = Paths.get("/home", "shamim", "personal/temp/hello.txt");

    try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())) {
      String line;

      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
