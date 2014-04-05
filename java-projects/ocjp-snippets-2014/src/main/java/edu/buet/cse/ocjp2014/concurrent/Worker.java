package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.Phaser;

public class Worker implements Runnable {
  private final String name;
  private final Phaser deliveryOrder;
  private final int count;
  
  public Worker(String name, Phaser deliveryOrder, int count) {
    this.name = name;
    this.deliveryOrder = deliveryOrder;
    this.count = count;
    
    this.deliveryOrder.register();
  }

  @Override
  public void run() {
    for (int i = 1; i <= count; i++) {
      System.out.printf("%s is doing his part on order number %d%n", name, i);
      
      if (i == 3) {
        deliveryOrder.arriveAndDeregister();
      } else {
        deliveryOrder.arriveAndAwaitAdvance();
      }
      
      try {
        Thread.sleep(3000);
      } catch (InterruptedException ex) {
        ex.printStackTrace(System.err);
      }
    }
  }
}
