package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
public class InnerTrial2 {
  class A {
    // static int i = 5;   // COMPILER ERROR !!!
    static final int j = 10;   // OK
  }
}
