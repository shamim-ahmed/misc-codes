package edu.buet.cse.ocjp2014.misc;

/**
 * Equality of wrapper class objects can be tricky !
 * @author shamim
 */
public class WrapperEqualityTrial {
  public static void main(String... args) {
    Integer i1 = 129;
    Integer i2 = 129;
    
    System.out.println(i1 == i2);
  }
}
