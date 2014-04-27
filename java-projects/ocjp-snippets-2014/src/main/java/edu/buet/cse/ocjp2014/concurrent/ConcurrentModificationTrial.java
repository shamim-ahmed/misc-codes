package edu.buet.cse.ocjp2014.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple example that generates ConcurrentModificationException
 *
 * @author shamim
 */
public class ConcurrentModificationTrial {

  public static void main(String... args) {
    List<Integer> values = new ArrayList<>();
    values.add(1);
    values.add(2);

    Iterator<Integer> iter = values.iterator();

    values.add(3);
    values.add(4);

    while (iter.hasNext()) {
      System.out.println(iter.next());   // this line will throw the exception
    }
  }
}
