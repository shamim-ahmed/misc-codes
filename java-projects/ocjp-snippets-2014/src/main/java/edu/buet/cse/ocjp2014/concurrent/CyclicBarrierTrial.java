package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTrial {
  public static void main(String... args) {
    CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
      @Override
      public void run() {
        System.out.println("The Great Game Begins !!!");
      }
    });
    
    Player[] players = {new Player("Alice", barrier), new Player("Bob", barrier), new Player("Cindarella", barrier)};
    
    for (Player p : players) {
      new Thread(p).start();
      
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        ex.printStackTrace(System.err);
      }
    }
  }
}
