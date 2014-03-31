package edu.buet.cse.ocjp2014.collections;

import java.util.Arrays;
import java.util.List;

// example of very exotic syntax !!
public class GenericsTrial {
  public static void main(String... args) {
    List<Integer> myList = Arrays.<Integer>asList(1, 2, 3, 4 ,5);
    Integer[] values = myList.<Integer>toArray(new Integer[5]);
    System.out.println(values[0]);
  }
}
