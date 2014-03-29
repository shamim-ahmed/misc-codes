package edu.buet.cse.ocjp2014.i18n;

import java.util.Locale;

public class LocaleTrial3 {
  public static void main(String... args) {
    Locale locale = new Locale("en", "US");
    System.out.println(locale);
    
    Locale locale2 = new Locale("ar");
    System.out.println(locale2.getDisplayLanguage());
    
    Locale locale3 = new Locale("de", "CH", "");
    System.out.println(locale3);
    
    Locale.Builder builder = new Locale.Builder();
    builder.setLanguage("fr");
    builder.setRegion("FR");
    Locale locale4 = builder.build();
    System.out.println(locale4);
  }
}
