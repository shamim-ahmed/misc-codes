package edu.buet.cse.spring.ch01.v3.impl;

import java.util.Objects;

import edu.buet.cse.spring.ch01.v3.model.Knight;
import edu.buet.cse.spring.ch01.v3.model.Quest;

public class BraveKnight implements Knight {
  private Quest quest;
  private Minstrel minstrel;
  
  public BraveKnight(Quest quest, Minstrel minstrel) {
    this.quest = Objects.requireNonNull(quest);
    this.minstrel = minstrel;
  }

  @Override
  public void embarkOnQuest() {
    minstrel.singBeforeQuest();
    quest.embark();
    minstrel.singAfterQuest();
  }
}
