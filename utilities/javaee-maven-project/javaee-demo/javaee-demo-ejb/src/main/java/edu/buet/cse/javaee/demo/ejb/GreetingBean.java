package edu.buet.cse.javaee.demo.ejb;

import javax.ejb.Local;

@Local
public interface GreetingBean {
  String getGreeting(String name);
}
