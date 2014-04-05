package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTrial2 {
  public static void main(String... args) {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    new Thread(new Waiter("Alice", lock, condition)).start();

    final String[] names = { "BD006", "BD007", "BD008" };
    
    for (String name : names) {
      new Thread(new Train(name, lock, condition)).start();
    }
  }
}
