package edu.buet.cse.ocjp.practice01.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Thou shalt not mix generic and raw types.
 * 
 * @author shamim
 *
 */
public class App3 {
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static void main(String... args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);

    List list2 = list1;
    list2.add("hello");

    List<Integer> list3 = list2;

    for (int n : list3) {
      System.out.println(n);
    }
  }
}
