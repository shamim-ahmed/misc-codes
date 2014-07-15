package edu.buet.cse.ocjp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shamim
 */
public class SubListTrial {
  public static void main(String... args) {
    List<Integer> values = new ArrayList<>();
    
    for (int i = 0; i < 10; i++) {
      values.add(i);
    }
    
    List<Integer> subList = values.subList(3, 7);
    System.out.println(subList);
    
    subList.clear();
    System.out.println(values);
    
    subList.add(1);
    System.out.println(values);
  }
}
