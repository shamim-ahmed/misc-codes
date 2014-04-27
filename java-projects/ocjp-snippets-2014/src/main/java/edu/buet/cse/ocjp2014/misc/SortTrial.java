package edu.buet.cse.ocjp2014.misc;

import java.util.Arrays;

/**
 * Does sorting with a null comparator work ?
 *
 * @author shamim
 */
public class SortTrial {
  
  public static void main(String... args) {
    String[] countries = {"Brazil", "Russia", "India", "China"};
    Arrays.sort(countries, null);
    System.out.println(Arrays.toString(countries));
  }
}
