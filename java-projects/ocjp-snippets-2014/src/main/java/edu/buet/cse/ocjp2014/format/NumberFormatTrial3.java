package edu.buet.cse.ocjp2014.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTrial3 {
  public static void main(String... args) {
    NumberFormat nf = NumberFormat.getPercentInstance(Locale.US);
    float val = 3.1415f;
    System.out.println(nf.format(val));
  }
}
