package edu.buet.cse.javaee.demo.ejb;

import javax.ejb.Stateless;

@Stateless
public class GreetingBeanImpl implements GreetingBean {

  @Override
  public String getGreeting(String name) {
    return String.format("Hello, %s", name);
  }
}
