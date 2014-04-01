package edu.buet.cse.scjp2014.misc;

/**
 *
 * @author shamim
 */
public class Person {
  private String name;
  private int age;
  
  public Person() {
    this("Shamim", 25);
  }
  
  public Person(String name, int age) {
    //this();   // uncomment to get a COMPILER ERROR  !!!
    this.name = name;
    this.age = age;
  }
}
