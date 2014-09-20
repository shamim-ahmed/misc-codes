package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */

class A {
  private int i = 5;
  
  class B extends A {
    private int i = 10;
    
    public void foo() {
      System.out.println(A.this.i);
      System.out.println(B.this.i);
    }
  }
}
public class InnerClassTrial {
  public static void main(String... args) {
    A.B b = new A().new B();
    b.foo();
  }
}
