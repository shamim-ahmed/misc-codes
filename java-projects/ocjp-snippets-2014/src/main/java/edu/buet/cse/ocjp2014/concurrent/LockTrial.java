package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTrial {
  public static void main(String... args) {
    Lock lock = new ReentrantLock();
    new Thread(new AtmUser("Alice", lock)).start();
    new Thread(new AtmUser("Bob", lock)).start();
  }
}
