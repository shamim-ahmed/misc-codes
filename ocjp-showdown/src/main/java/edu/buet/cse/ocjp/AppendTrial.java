package edu.buet.cse.ocjp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author shamim
 */
public class AppendTrial {

  public static void main(String... args) {
    Path p = Paths.get("/home/shamim/personal/temp/hello.txt");

    try (BufferedWriter writer = Files.newBufferedWriter(p, Charset.defaultCharset(),
            new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.DSYNC})) {
      writer.write("hola hola hola !!!");
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
