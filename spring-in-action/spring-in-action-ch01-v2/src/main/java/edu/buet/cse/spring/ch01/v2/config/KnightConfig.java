package edu.buet.cse.spring.ch01.v2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.buet.cse.spring.ch01.v2.impl.BraveKnight;
import edu.buet.cse.spring.ch01.v2.impl.RescueDamselQuest;
import edu.buet.cse.spring.ch01.v2.model.Knight;
import edu.buet.cse.spring.ch01.v2.model.Quest;

@Configuration
public class KnightConfig {
  @Bean
  public Quest quest() {
    return new RescueDamselQuest(System.out);
  }
  
  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
}
