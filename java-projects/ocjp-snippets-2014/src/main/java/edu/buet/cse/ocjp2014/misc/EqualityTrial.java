package edu.buet.cse.ocjp2014.misc;

/**
 * Equality of wrapper types
 *
 * @author shamim
 */
public class EqualityTrial {

  public static void main(String... args) {
    Integer i = 11;
    Integer j = 10;
    Integer k = ++j;

    System.out.println(i == k);
    System.out.println(i.equals(k));
  }
}
