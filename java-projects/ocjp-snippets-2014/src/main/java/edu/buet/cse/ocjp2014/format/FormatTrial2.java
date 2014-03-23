package edu.buet.cse.ocjp2014.format;

import java.io.PrintWriter;

public class FormatTrial2 {
  public static void main(String... args) {
    PrintWriter out = new PrintWriter(System.out);
    out.printf("%2$d is greater than %2$d%n", 10, 5);
    out.close();
  }
}
