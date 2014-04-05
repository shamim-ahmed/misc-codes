package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.locks.Lock;

public class AtmUser implements Runnable {
  private final String name;
  private final Lock lock;

  public AtmUser(String name, Lock lock) {
    this.name = name;
    this.lock = lock;
  }

  @Override
  public void run() {
    try {
      lock.lock();
      System.out.printf("%s is using the ATM%n", name);
      Thread.sleep(2000);
      System.out.printf("%s is done with using the ATM%n", name);
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    } finally {
      lock.unlock();
    }
  }
}
