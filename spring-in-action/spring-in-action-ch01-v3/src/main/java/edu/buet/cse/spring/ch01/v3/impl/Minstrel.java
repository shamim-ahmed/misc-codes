package edu.buet.cse.spring.ch01.v3.impl;

import java.io.PrintStream;

public class Minstrel {
  private PrintStream out;
  
  public Minstrel(PrintStream out) {
    this.out = out;
  }
  
  public void singBeforeQuest() {
    out.println("La La La, the quest has begun !!");
  }
  
  public void singAfterQuest() {
    out.println("Tee Hee Hee, the quest has ended !!");
  }
}
