package edu.buet.cse.ocjp2014.collections;

import java.util.TreeSet;

public class TreeSetTrial2 {
  public static void main(String... args) {
    TreeSet<String> mySet = new TreeSet<>();
    mySet.add("one");
    mySet.add("One");
    mySet.add("ONE");
    
    System.out.println(mySet.ceiling("On"));
  }
}
