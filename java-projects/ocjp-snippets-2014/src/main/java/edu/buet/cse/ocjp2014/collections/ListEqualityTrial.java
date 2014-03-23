package edu.buet.cse.ocjp2014.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEqualityTrial {
  public static void main(String... args) {
    List<String> list1 = new ArrayList<>();
    list1.add("abc");
    List<String> list2 = new ArrayList<>();
    list2.add("abc");
    
    System.out.println(list1.equals(list2));
  }
}
