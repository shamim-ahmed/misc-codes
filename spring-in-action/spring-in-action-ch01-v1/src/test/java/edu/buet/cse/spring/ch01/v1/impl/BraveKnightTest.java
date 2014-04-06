package edu.buet.cse.spring.ch01.v1.impl;

import org.junit.Test;

import static org.mockito.Mockito.*;
import edu.buet.cse.spring.ch01.v1.impl.BraveKnight;
import edu.buet.cse.spring.ch01.v1.model.Knight;
import edu.buet.cse.spring.ch01.v1.model.Quest;

public class BraveKnightTest {
  @Test
  public void testWithMockQuest() {
    Quest quest = mock(Quest.class);
    Knight knight = new BraveKnight(quest);
    knight.embarkOnQuest();
    verify(quest, times(1)).embark();
  }
}
