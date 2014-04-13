package edu.buet.cse.ocjp2014.mockexam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * An example of using resolveSibling() method of Path class
 * 
 * @author shamim
 * 
 */
public class FileCopyTrial {
  public static void main(String... args) {
    Path path1 = Paths.get("/home/shamim/personal/temp/data.sql");
    Path path2 = path1.resolveSibling("dump.sql");
    String lineSeparator = System.getProperty("line.separator", "\n");

    try (BufferedReader reader = Files.newBufferedReader(path1, Charset.defaultCharset());
        BufferedWriter writer = Files.newBufferedWriter(path2, Charset.defaultCharset())) {
      String line;

      while ((line = reader.readLine()) != null) {
        writer.write(line.concat(lineSeparator));
      }

      System.out.printf("%s was successfully copied to %s%n", path1, path2);
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
