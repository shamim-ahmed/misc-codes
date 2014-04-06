package edu.buet.cse.spring.ch01.v1.impl;

import java.io.PrintStream;

import edu.buet.cse.spring.ch01.v1.model.Quest;

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
