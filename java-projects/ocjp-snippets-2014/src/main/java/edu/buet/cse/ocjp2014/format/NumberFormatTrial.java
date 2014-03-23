package edu.buet.cse.ocjp2014.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTrial {
  public static void main(String... args) throws Exception {
    NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
    String s = "123,45";
    System.out.println(nf.parseObject(s));
  }
}
