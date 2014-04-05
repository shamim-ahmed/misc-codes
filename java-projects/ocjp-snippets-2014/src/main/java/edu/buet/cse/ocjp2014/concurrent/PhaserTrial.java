package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.Phaser;

public class PhaserTrial {
  public static void main(String... args) {
    final int count = 3;
    Phaser deliveryOrder = new Phaser(1);
    Worker[] workers = { new Worker("Cook", deliveryOrder, count), new Worker("Helper", deliveryOrder, count),
        new Worker("Attendant", deliveryOrder, count) };

    for (Worker w : workers) {
      new Thread(w).start();
    }
    
    for (int i = 1; i <= count; i++) {
      deliveryOrder.arriveAndAwaitAdvance();
      System.out.printf("Delivery of order %d is complete%n", i);
    }
    
    deliveryOrder.arriveAndDeregister();
    System.out.println("All orders are served !!");
  }
}
