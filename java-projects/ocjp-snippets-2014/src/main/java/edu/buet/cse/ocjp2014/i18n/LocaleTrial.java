package edu.buet.cse.ocjp2014.i18n;

import java.util.Locale;

public class LocaleTrial {
  public static void main(String... args) {
    Locale locale = Locale.getDefault();
    System.out.println(locale.getLanguage());
    System.out.println(locale.getCountry());
    System.out.println(locale.getVariant());
  }
}
