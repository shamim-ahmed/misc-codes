package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.Semaphore;

public class Person implements Runnable {
  private final String name;
  private final Semaphore atmMachines;
  
  public Person(String name, Semaphore atmMachines) {
    this.name = name;
    this.atmMachines = atmMachines;
  }
  
  @Override
  public void run() {
    try {
      atmMachines.acquire();
      System.out.printf("%s is accessing ATM machine...%n", name);
      
      Thread.sleep(2000);
      
      System.out.printf("%s is relinquishing access %n", name);
      atmMachines.release();
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
