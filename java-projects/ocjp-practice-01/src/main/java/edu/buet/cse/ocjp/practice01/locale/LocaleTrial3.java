package edu.buet.cse.ocjp.practice01.locale;

import java.util.Locale;

/**
 * Various ways of creating Locale objects
 * 
 * @author shamim
 * 
 */
public class LocaleTrial3 {
  public static void main(String... args) {
    Locale locale1 = new Locale("en", "AU");
    System.out.println(locale1);

    Locale locale2 = new Locale("th", "TH", "TH");
    System.out.println(locale2);

    Locale locale3 = new Locale.Builder().setLanguage("th").setRegion("TH").build();
    System.out.println(locale3);
  }
}
