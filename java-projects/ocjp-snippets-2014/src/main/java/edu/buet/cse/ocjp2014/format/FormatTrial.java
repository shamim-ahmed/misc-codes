package edu.buet.cse.ocjp2014.format;

import java.io.PrintWriter;

public class FormatTrial {
  public static void main(String... args) {
    PrintWriter out = new PrintWriter(System.out);
    double val = 2.73258;
    String msg = " is almost";
    int x = 3;
    out.printf("%4.2f%s %d%n", val, msg, x);
    out.close();
  }
}
