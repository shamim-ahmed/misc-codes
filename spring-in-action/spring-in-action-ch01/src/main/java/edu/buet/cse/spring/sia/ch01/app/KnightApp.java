package edu.buet.cse.spring.sia.ch01.app;

import edu.buet.cse.spring.sia.ch01.impl.BraveKnight;
import edu.buet.cse.spring.sia.ch01.impl.RescueDamselQuest;
import edu.buet.cse.spring.sia.ch01.model.Knight;

public class KnightApp {
  public static void main(String... args) {
    Knight knight = new BraveKnight(new RescueDamselQuest(System.out));
    knight.embarkOnQuest();
  }
}
