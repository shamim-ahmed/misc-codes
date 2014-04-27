package edu.buet.cse.ocjp2014.misc;

/**
 * Vararg is always the last choice
 * @author shamim
 */
public class OverloadTrial {
  public static void main(String... args) {
    foo(10);
  }
  
  private static void foo(int... values) {
    System.out.println("vararg");
  }
  
  private static void foo(Integer n) {
    System.out.println("Integer");
  }
}
