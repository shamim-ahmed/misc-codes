package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounter {
  private AtomicInteger count = new AtomicInteger(0);
  
  public int getCount() {
    return count.get();
  }
  
  public int increment() {
    return count.incrementAndGet();
  }
}
