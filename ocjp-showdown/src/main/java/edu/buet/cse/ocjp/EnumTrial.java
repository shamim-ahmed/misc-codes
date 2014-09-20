package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
enum Animal {

  DOG, CAT, BEAR, TIGER, LION;
  static int n = 100;

  private Animal() {
    // System.out.println(n);   // COMPILER ERROR !!!
  }
};

public class EnumTrial {

}
