package edu.buet.cse.ocjp.practice01.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author shamim
 *
 */
public class App2 {
  public static void main(String... args) {
    foo(Arrays.asList("hello", "world"));
  }

  private static <T extends CharSequence> void foo(List<T> items) {
    for (T item : items) {
      System.out.println(item);
    }
  }
}
