package edu.buet.cse.ocjp2014.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ListEqualityTrial2 {
  public static void main(String... args) {
    List<Integer> list1 = new ArrayList<>(Arrays.<Integer>asList(1, 2, 3));
    List<Integer> list2 = new Vector<>(Arrays.<Integer>asList(1, 2, 3));
    
    System.out.println(list1.equals(list2));
  }
}
