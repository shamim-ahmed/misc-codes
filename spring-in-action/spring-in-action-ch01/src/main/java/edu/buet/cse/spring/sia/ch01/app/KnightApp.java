package edu.buet.cse.spring.sia.ch01.app;

import edu.buet.cse.spring.sia.ch01.impl.DamselRescuingKnight;
import edu.buet.cse.spring.sia.ch01.model.Knight;

public class KnightApp {
  public static void main(String... args) {
    Knight knight = new DamselRescuingKnight();
    knight.embarkOnQuest();
  }
}
