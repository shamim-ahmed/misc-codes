package edu.buet.cse.ocjp2014.misc;

public class OverloadingTrial {
  public static void main(String... args) {
    foo(123);
    foo(123L);
    foo(1.23);
  }
  
  public static void foo(int x) {
    System.out.println("int");
  }
  
  public static void foo(float f) {
    System.out.println("float");
  }
  
  public static void foo(Object obj) {
    System.out.println("object");
  }
}
