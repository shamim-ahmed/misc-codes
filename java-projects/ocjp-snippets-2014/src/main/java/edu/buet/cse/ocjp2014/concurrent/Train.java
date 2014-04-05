package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Train implements Runnable {
  private final String name;
  private final Lock lock;
  private final Condition condition;
  
  public Train(String name, Lock lock, Condition condition) {
    this.name = name;
    this.lock = lock;
    this.condition = condition;
  }
  
  @Override
  public void run() {    
    try {
      lock.lock();
      Thread.sleep(2000);
      System.out.printf("Train %s arrived%n", name);
      
      if (name.equals("BD007")) {
        condition.signalAll();
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    } finally {
      lock.unlock();
    }
  }
}
