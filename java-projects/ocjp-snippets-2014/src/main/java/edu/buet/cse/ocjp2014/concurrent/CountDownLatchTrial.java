package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTrial {
  public static void main(String... args) {
    CountDownLatch counter = new CountDownLatch(10);
    Runner[] runners = { new Runner("Alice", counter), new Runner("Bob", counter), new Runner("Clara", counter) };

    for (Runner r : runners) {
      new Thread(r).start();
    }
    
    long n = counter.getCount();
    
    while (n > 0) {
      System.out.println(n);
      
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        ex.printStackTrace(System.err);
      }
      
      counter.countDown();
      n = counter.getCount();
      
      if (n == 0) {
        System.out.println("START !!!");
      }
    }
   
  }
}
