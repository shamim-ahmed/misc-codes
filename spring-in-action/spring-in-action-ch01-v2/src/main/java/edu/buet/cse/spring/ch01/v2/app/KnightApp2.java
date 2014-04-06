package edu.buet.cse.spring.ch01.v2.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.buet.cse.spring.ch01.v2.config.SlayDragonConfig;
import edu.buet.cse.spring.ch01.v2.model.Knight;

public class KnightApp2 {
  public static void main(String... args) {
    try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext()) {
      appContext.register(SlayDragonConfig.class);
      appContext.refresh();
      Knight knight = appContext.getBean("knight", Knight.class);
      knight.embarkOnQuest();
    }
  }
}
