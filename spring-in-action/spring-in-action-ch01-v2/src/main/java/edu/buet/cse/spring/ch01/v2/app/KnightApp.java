package edu.buet.cse.spring.ch01.v2.app;

import edu.buet.cse.spring.ch01.v2.impl.BraveKnight;
import edu.buet.cse.spring.ch01.v2.impl.RescueDamselQuest;
import edu.buet.cse.spring.ch01.v2.model.Knight;

public class KnightApp {
  public static void main(String... args) {
    Knight knight = new BraveKnight(new RescueDamselQuest(System.out));
    knight.embarkOnQuest();
  }
}
