package edu.buet.cse.ocjp2014.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatTrial {
  public static void main(String... args) {
    DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
    String s = "10/19/2014";
    
    try {
      Date date = df.parse(s);
      System.out.println(date.getTime());
    } catch (ParseException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
