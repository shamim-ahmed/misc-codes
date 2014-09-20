package edu.buet.cse.ocjp;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shamim
 */
public class SubListTrial2 {
  public static void main(String... args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> subList = values.subList(1, 3);
    System.out.println(subList);
    
    subList.clear();
    System.out.println(values);
  }
}
