package edu.buet.cse.ocjp.practice01.locale;

import java.util.Locale;

/**
 * @author shamim
 *
 */
public class LocaleTrial {
  public static void main(String... args) {
    Locale locale = Locale.getDefault();
    System.out.printf("The default locale is: %s%n", locale);
  }
}
