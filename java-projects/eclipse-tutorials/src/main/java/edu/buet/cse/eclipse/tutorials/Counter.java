package edu.buet.cse.eclipse.tutorials;

/**
 * @author shamim
 *
 */
public class Counter {
  private int n;

  public Counter() {
    n = 0;
  }

  public void count() {
    n++;
  }
  
  public void count(int times) {
    if (times < 0) {
      throw new IllegalArgumentException("times cannot be negative");
    }
    
    for (int i = 0; i < times; i++) {
      count();
    }
  }

  public int getResult() {
    return n;
  }
}
