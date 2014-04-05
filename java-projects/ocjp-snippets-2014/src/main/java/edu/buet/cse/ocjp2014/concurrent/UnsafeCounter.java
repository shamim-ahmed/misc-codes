package edu.buet.cse.ocjp2014.concurrent;

public class UnsafeCounter {
  private Integer count = 0;

  public int getCount() {
    return count;
  }

  public int increment() {
    count += 1;
    return count;
  }
}
