package edu.buet.cse.spring.sia.ch01.impl;

import edu.buet.cse.spring.sia.ch01.model.Quest;

public class RescueDamselQuest implements Quest {

  @Override
  public void embark() {
    System.out.println("The damsel is rescued !!");
  }
}
