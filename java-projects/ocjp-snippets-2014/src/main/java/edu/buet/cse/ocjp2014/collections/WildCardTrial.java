package edu.buet.cse.ocjp2014.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class WildCardTrial {
  public static void main(String... args) {
    // List<?> list1 = new ArrayList<?>();
    Vector<?> list2 = new Vector<String>(Arrays.asList("apple", "orange", "banana"));
    Stack<? extends Number> list3 = new Stack<Integer>();
    List<? super Number> list4 = new ArrayList<Number>(Arrays.asList(1, 2, 3));
    
    printSize(list2);
    printSize(list3);
    printSize(list4);
  }
  
  private static void printSize(List<?> myList) {
    System.out.println(myList.size());
  }
}
