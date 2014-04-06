package edu.buet.cse.spring.sia.ch01.impl;

import edu.buet.cse.spring.sia.ch01.model.Quest;

public class SlayDragonQuest implements Quest {

  @Override
  public void embark() {
    System.out.println("The dragon is slain !!");
  }
}
