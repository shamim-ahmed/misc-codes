package edu.buet.cse.ocjp2014.i18n;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class LocaleTrial2 {
  public static void main(String... args) {
    Locale[] locales = Locale.getAvailableLocales();
    Arrays.sort(locales, new Comparator<Locale>() {
      @Override
      public int compare(Locale lc1, Locale lc2) {
        int result = lc1.getDisplayLanguage().compareTo(lc2.getDisplayLanguage());
        
        if (result == 0) {
          result = lc1.getDisplayCountry().compareTo(lc2.getDisplayCountry());
        }
        
        return result;
      }
    });
    
    for (Locale lc : locales) {
      System.out.printf("%s %s%n", lc.getDisplayLanguage(), lc.getDisplayCountry());
    }
  }
}
