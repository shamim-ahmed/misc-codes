package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Waiter implements Runnable {
  private final String name;
  private final Lock lock;
  private final Condition condition;
  
  public Waiter(String name, Lock lock, Condition condition) {
    this.name = name;
    this.lock = lock;
    this.condition = condition;
  }

  @Override
  public void run() {
    try {
      lock.lock();
      System.out.printf("%s is waiting for Train BD007 to arrive%n", name);
      condition.await();
      System.out.println("Alice is happy, as Train BD007 has finally arrived !");
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    } finally {
      lock.unlock();
    }
  }
}
