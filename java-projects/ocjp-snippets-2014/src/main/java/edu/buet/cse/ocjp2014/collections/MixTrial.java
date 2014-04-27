package edu.buet.cse.ocjp2014.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An example on mixing generic and non-generic types
 *
 * @author shamim
 */
public class MixTrial {

  @SuppressWarnings({"unchecked", "rawtypes"})
  public static void main(String... args) {
    List list1 = new ArrayList<>(Arrays.asList(1, 2.0, "hello"));
    List list2 = Arrays.asList(3, 4.0, 5L, "world");
    list1 = list2;
    System.out.println(list1);
  }
}
