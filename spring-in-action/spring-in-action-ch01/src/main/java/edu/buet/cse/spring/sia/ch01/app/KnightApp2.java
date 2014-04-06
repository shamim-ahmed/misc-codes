package edu.buet.cse.spring.sia.ch01.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buet.cse.spring.sia.ch01.model.Knight;

public class KnightApp2 {
  public static void main(String... args) {
    try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        "/edu/buet/cse/spring/sia/ch01/spring-beans.xml")) {
      Knight knight = appContext.getBean("knight", Knight.class);
      knight.embarkOnQuest();
    }
  }
}
