package edu.buet.cse.ocjp.practice01.generics;

/**
 * @author shamim
 *
 */

class Base<T> {
  final T item;

  Base(T item) {
    this.item = item;
  }

  T getItem() {
    return item;
  }
}

class Derived<T> extends Base<T> {
  Derived(T item) {
    super(item);
  }
}

public class App4 {
  public static void main(String... args) {
    Base<String> b = new Derived<>("hello");
    System.out.println(b.getItem());
  }
}
