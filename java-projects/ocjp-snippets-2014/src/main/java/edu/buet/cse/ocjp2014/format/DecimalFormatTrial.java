package edu.buet.cse.ocjp2014.format;

import java.text.DecimalFormat;

public class DecimalFormatTrial {
  public static void main(String... args) {
    DecimalFormat df = new DecimalFormat("#,#00.00##");
    double val = 3.141592653;
    System.out.println(df.format(val));
  }
}
