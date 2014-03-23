package edu.buet.cse.ocjp2014.misc;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTrial2 {
  public static void main(String... args) {
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    float f = 99.999F;
    System.out.println(nf.format(f));
  }
}
