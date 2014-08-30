package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
public class InnerClassTrial2 {
  class A {
  }
  
  void foo() {
    A a = new InnerClassTrial2.A();   // Note this weird syntax !!
  }
}
