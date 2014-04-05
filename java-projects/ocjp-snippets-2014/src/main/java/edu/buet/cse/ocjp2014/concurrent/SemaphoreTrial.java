package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreTrial {
  public static void main(String... args) {
    Semaphore atmMachines = new Semaphore(2, false);
    
    Person[] persons = {new Person("Alice", atmMachines), new Person("Bob", atmMachines),
                        new Person("Clara", atmMachines), new Person("Danny", atmMachines),
                        new Person("Elizabeth", atmMachines)};
    
    for (Person p : persons) {
      new Thread(p).start();
    }
  }
}
