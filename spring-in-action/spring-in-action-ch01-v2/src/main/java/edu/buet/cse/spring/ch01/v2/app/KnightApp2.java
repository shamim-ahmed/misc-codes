package edu.buet.cse.spring.ch01.v2.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buet.cse.spring.ch01.v2.model.Knight;

public class KnightApp2 {
  public static void main(String... args) {
    try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        "/edu/buet/cse/spring/ch01/v2/spring-beans.xml")) {
      Knight knight = appContext.getBean("knight", Knight.class);
      knight.embarkOnQuest();
    }
  }
}
