package edu.buet.cse.ocjp2014.i18n;

import java.util.Locale;

public class LocaleTrial4 {
  public static void main(String... args) {
    Locale locale1 = Locale.FRANCE;
    Locale locale2 = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
    System.out.println(locale1.equals(locale2));
    
    Locale locale3 = Locale.FRENCH;
    Locale locale4 = new Locale.Builder().setLanguage("fr").build();
    System.out.println(locale3.equals(locale4));
    
    System.out.println(locale1.equals(locale4));
    System.out.println(locale2.equals(locale3));
  }
}
