package edu.buet.cse.spring.ch01.v2.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.buet.cse.spring.ch01.v2.config.KnightConfig;
import edu.buet.cse.spring.ch01.v2.model.Knight;

public class KnightApp {
  public static void main(String... args) {
    try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext()) {
      appContext.register(KnightConfig.class);
      appContext.refresh();
      Knight knight = appContext.getBean("knight", Knight.class);
      knight.embarkOnQuest();
    }
  }
}
