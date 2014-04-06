package edu.buet.cse.spring.ch01.v1.app;

import edu.buet.cse.spring.ch01.v1.impl.BraveKnight;
import edu.buet.cse.spring.ch01.v1.impl.RescueDamselQuest;
import edu.buet.cse.spring.ch01.v1.model.Knight;

public class KnightApp {
  public static void main(String... args) {
    Knight knight = new BraveKnight(new RescueDamselQuest(System.out));
    knight.embarkOnQuest();
  }
}
