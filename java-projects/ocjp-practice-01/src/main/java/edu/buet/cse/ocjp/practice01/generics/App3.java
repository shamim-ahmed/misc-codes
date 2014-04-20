package edu.buet.cse.ocjp.practice01.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shamim
 *
 */
public class App3 {
  public static void main(String... args) {
    List<List<Integer>> myList = new ArrayList<>();
    myList.add(null);
    myList.add(new ArrayList<Integer>());
    System.out.println(myList);
  }
}
