package edu.buet.cse.ocjp2014.misc;

/**
 * How to traverse through all the values of an enum
 * @author shamim
 */
public class EnumTrial {
  enum Season {SUMMER, AUTUMN, WINTER, SPRING}
  
  public static void main(String... args) {
    for (Season s : Season.values()) {
      System.out.println(s);
    }
  }
}
