package edu.buet.cse.spring.ch01.v3.impl;

import java.io.PrintStream;

import edu.buet.cse.spring.ch01.v3.model.Quest;

public class RescueDamselQuest implements Quest {
  private final PrintStream out;

  public RescueDamselQuest(PrintStream out) {
    this.out = out;
  }

  @Override
  public void embark() {
    out.println("The damsel is rescued !!");
  }
}
