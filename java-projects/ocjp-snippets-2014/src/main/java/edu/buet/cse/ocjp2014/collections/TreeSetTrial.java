package edu.buet.cse.ocjp2014.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTrial {
  public static void main(String... args) {
    Set<String> mySet = new TreeSet<>();
    mySet.add("shamim");
    mySet.add("ahmed");
    mySet.add(null);  // This line will cause an exception. Think why.
    
    for (String s : mySet) {
      System.out.println(s);
    }
  }
}
