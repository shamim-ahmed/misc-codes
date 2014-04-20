package edu.buet.cse.ocjp.practice01.misc;

/**
 * @author shamim
 *
 */
public class App5 {
  private static class Foo {
    int max = 10;
  }
  
  private static class Bar extends Foo {
    static int max = 200;
  }
  
  public static void main(String... args) {
    Bar b = new Bar();
    System.out.println(b.max);
    System.out.println(Bar.max);
  }
}
