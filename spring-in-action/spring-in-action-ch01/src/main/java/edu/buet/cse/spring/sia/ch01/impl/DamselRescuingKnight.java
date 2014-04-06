package edu.buet.cse.spring.sia.ch01.impl;

import edu.buet.cse.spring.sia.ch01.model.Knight;
import edu.buet.cse.spring.sia.ch01.model.Quest;

public class DamselRescuingKnight implements Knight {
  private Quest quest;
  
  public DamselRescuingKnight() {
    quest = new RescueDamselQuest();
  }

  @Override
  public void embarkOnQuest() {
    quest.embark();
  }
}
