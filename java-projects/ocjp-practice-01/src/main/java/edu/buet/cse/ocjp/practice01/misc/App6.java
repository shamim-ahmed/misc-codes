package edu.buet.cse.ocjp.practice01.misc;

import java.io.IOException;

/**
 * What happens when you throw a wider exception from a subclass constructor ?
 * 
 * @author shamim
 * 
 */
public class App6 {
  private static class Foo {
    Foo() throws IOException {
    }

    @Override
    public String toString() {
      return getClass().getSimpleName();
    }
  }

  private static class Bar extends Foo {
    Bar() throws Exception {
    }

    @Override
    public String toString() {
      return getClass().getSimpleName();
    }
  }

  public static void main(String... args) throws Exception {
    Foo b = new Bar();
    System.out.println(b);
  }
}
