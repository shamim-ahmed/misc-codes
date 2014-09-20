package edu.buet.cse.ocjp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shamim
 */
public class GenericsTrial {
  public static void main(String... args) {
    List<? super String> list = new ArrayList<>();
    list.add("hello");
    list.add("world");
    System.out.println(list);
  }
}
