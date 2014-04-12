package edu.buet.cse.ocjp.practice01.locale;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/**
 * Sort the available locales and print them
 * 
 * @author shamim
 * 
 */
public class LocaleTral2 {
  public static void main(String... args) {
    Locale[] availableLocales = Locale.getAvailableLocales();
    Arrays.sort(availableLocales, new CustomLocaleComparator());

    for (Locale locale : availableLocales) {
      System.out.println(locale);
    }
  }

  private static class CustomLocaleComparator implements Comparator<Locale> {
    @Override
    public int compare(Locale firstLocale, Locale secondLocale) {
      String firstLanguage = Objects.requireNonNull(firstLocale.getLanguage());
      String secondLanguage = Objects.requireNonNull(secondLocale.getLanguage());
      int result = firstLanguage.compareTo(secondLanguage);

      if (result != 0) {
        return result;
      }

      String firstCountry = Objects.requireNonNull(firstLocale.getCountry());
      String secondCountry = Objects.requireNonNull(secondLocale.getCountry());
      result = firstCountry.compareTo(secondCountry);

      if (result != 0) {
        return result;
      }

      return 0;
    }

  }
}
