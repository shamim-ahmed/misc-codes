package edu.buet.cse.ocjp.practice01.generics;

/**
 * @author shamim
 *
 */
public class App5 {
  private static class Base<T> {
    private final T item;

    Base(T item) {
      this.item = item;
    }

    T getItem() {
      return item;
    }
  }

  private static class Derived extends Base<String> {
    Derived(String item) {
      super(item);
    }
  }

  public static void main(String... args) {
    Base<String> b = new Derived("hello");
    System.out.println(b.getItem());
  }
}
