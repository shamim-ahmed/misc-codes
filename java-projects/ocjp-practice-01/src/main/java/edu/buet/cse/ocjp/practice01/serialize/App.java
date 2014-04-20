package edu.buet.cse.ocjp.practice01.serialize;

import java.io.Serializable;

/**
 * A static field can be transient, although it is meaningless.
 * 
 * @author shamim
 * 
 */
public class App {
  private static class Foo implements Serializable {
    private static final long serialVersionUID = 1L;
    public static transient int value = 10;
  }

  public static void main(String... args) {
    System.out.println(Foo.value);
  }
}
