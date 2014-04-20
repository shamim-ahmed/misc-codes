package edu.buet.cse.ocjp.practice01.misc;

/**
 * @author shamim
 *
 */

public class App2 {
  public static void main(String... args) {
    Season s = Season.SPRING;
    
    System.out.println(s instanceof Season);
    System.out.println(s instanceof Foo);
    System.out.println(s instanceof Enum);
  }
}

interface Foo {}

enum Season implements Foo {
  SUMMER, AUTUMN, WINTER, SPRING
}
