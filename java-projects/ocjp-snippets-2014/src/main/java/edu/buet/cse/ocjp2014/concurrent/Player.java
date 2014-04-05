package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player implements Runnable {
  private final String name;
  private final CyclicBarrier barrier;
  
  public Player(String name, CyclicBarrier barrier) {
    this.name = name;
    this.barrier = barrier;
  }

  @Override
  public void run() {    
    try {
      System.out.printf("%s is ready to play%n", name);
      barrier.await();
      System.out.printf("%s is now playing%n", name);
    } catch (BrokenBarrierException | InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
 