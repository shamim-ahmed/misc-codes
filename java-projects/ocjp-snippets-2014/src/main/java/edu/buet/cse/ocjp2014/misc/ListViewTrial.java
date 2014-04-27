package edu.buet.cse.ocjp2014.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Can I sort an array while viewing it as a list ?
 *
 * @author shamim
 */
public class ListViewTrial {

  public static void main(String... args) {
    List<String> countries = Arrays.asList("Brazil", "Russia", "India", "China");
    Collections.sort(countries);
    System.out.println(countries);

    try {
      System.out.println(countries.remove(0));
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }

    try {
      countries.add("Mexico");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }
  }
}
