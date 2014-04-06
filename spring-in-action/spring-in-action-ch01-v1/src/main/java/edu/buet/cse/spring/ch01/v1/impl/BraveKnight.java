package edu.buet.cse.spring.ch01.v1.impl;

import java.util.Objects;

import edu.buet.cse.spring.ch01.v1.model.Knight;
import edu.buet.cse.spring.ch01.v1.model.Quest;

public class BraveKnight implements Knight {
  private Quest quest;
  
  public BraveKnight(Quest quest) {
    this.quest = Objects.requireNonNull(quest);
  }

  @Override
  public void embarkOnQuest() {
    quest.embark();
  }
}
