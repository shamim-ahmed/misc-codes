package edu.buet.cse.ocjp2014.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetTrial {
  public static void main(String... args) {
    Set<String> mySet = new HashSet<>();
    mySet.add("shamim");
    mySet.add("ahmed");
    mySet.add(null);
    
    for (String s : mySet) {
      System.out.println(s);
    }
  }
}
