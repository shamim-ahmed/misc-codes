package edu.buet.cse.spring.ch01.v3.impl;

import org.junit.Test;

import static org.mockito.Mockito.*;
import edu.buet.cse.spring.ch01.v3.impl.BraveKnight;
import edu.buet.cse.spring.ch01.v3.model.Knight;
import edu.buet.cse.spring.ch01.v3.model.Quest;

public class BraveKnightTest {
  @Test
  public void testWithMockQuest() {
    Quest mockQuest = mock(Quest.class);
    Minstrel mockMinstrel = mock(Minstrel.class);
    Knight knight = new BraveKnight(mockQuest, mockMinstrel);
    knight.embarkOnQuest();
    verify(mockQuest, times(1)).embark();
    verify(mockMinstrel, times(1)).singBeforeQuest();
    verify(mockMinstrel, times(1)).singAfterQuest();
  }
}
