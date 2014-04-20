package edu.buet.cse.ocjp.practice01.misc;

/**
 * Bury the confusion about static and instance field name collision for good
 * 
 * @author shamim
 *
 */

public class App4 {
  private static class Foo {
    static int max = 10;
  }
  
  private static class Bar extends Foo {
    int max = 200;
  }
  
  public static void main(String... args) {
    Bar b = new Bar();
    System.out.println(b.max);
    //System.out.println(Bar.max);
    System.out.println(Foo.max);
  }
}
