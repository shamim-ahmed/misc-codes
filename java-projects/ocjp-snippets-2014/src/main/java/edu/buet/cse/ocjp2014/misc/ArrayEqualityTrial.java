package edu.buet.cse.ocjp2014.misc;

import java.util.Arrays;

/**
 * How to determine if two arrays are equal ?
 * @author shamim
 */
public class ArrayEqualityTrial {
  public static void main(String... args) {
    String[] array1 = {"hello", "world", "!"};
    String[] array2 = {"hello", "world", "!"};
    
    System.out.println(array1 == array2);
    System.out.println(array1.equals(array2));
    System.out.println(Arrays.equals(array1, array2));
  }
}
