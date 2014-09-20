package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
public class EnumTrial2 {
  enum Animal { CAT, DOG, LION, TIGER };
  
  public static void main(String... args) {
    for (Animal a : Animal.values()) {
      System.out.printf("%d %s%n", a.ordinal(), a.name());
    }
  }
}
