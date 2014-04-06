package edu.buet.cse.spring.ch01.v3.impl;

import java.io.PrintStream;

import edu.buet.cse.spring.ch01.v3.model.Quest;

public class SlayDragonQuest implements Quest {
  private final PrintStream out;
  
  public SlayDragonQuest(PrintStream out) {
    this.out = out;
  }
  
  @Override
  public void embark() {
    out.println("The dragon is slain !!");
  }
}
