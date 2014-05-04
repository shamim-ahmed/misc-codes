package edu.buet.cse.eclipse.tutorials;

/**
 * @author shamim
 *
 */
public class Main {
  public static void main(String... args) {
    Counter counter = new Counter();
    counter.count(20);
    System.out.printf("The result is: %d%n", counter.getResult());
  }
}
