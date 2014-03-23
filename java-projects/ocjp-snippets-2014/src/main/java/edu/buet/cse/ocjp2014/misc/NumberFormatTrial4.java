package edu.buet.cse.ocjp2014.misc;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTrial4 {
  public static void main(String... args) {
    NumberFormat nf = NumberFormat.getPercentInstance(Locale.US);
    String s = "75%";
    
    try {
      Number val = nf.parse(s);
      System.out.println(val);
    } catch (ParseException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
