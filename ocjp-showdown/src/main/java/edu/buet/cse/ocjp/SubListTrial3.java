package edu.buet.cse.ocjp;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shamim
 */
public class SubListTrial3 {

  public static void main(String... args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> subList = values.subList(1, 3);
    System.out.println(subList);

    subList.set(0, 9);
    System.out.println(values);
  }
}
