package edu.buet.cse.spring.ch01.v1.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buet.cse.spring.ch01.v1.model.Knight;

public class KnightApp2 {
  public static void main(String... args) {
    try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        "/edu/buet/cse/spring/ch01/v1/spring-beans.xml")) {
      Knight knight = appContext.getBean("knight", Knight.class);
      knight.embarkOnQuest();
    }
  }
}
