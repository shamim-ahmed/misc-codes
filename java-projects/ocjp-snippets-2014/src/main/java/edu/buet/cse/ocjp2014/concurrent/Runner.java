package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.CountDownLatch;

public class Runner implements Runnable {
  private final String name;
  private final CountDownLatch counter;
  
  public Runner(String name, CountDownLatch counter) {
    this.name = name;
    this.counter = counter;
  }

  @Override
  public void run() {
    try {
      System.out.printf("%s is ready to run%n", name);
      counter.await();
      System.out.printf("%s is now running%n", name);
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
