package edu.buet.cse.ocjp2014.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * How CopyOnWriteArrayList works
 *
 * @author shamim
 */
public class CopyOnWriteArrayListTrial {

  public static void main(String... args) {
    List<Integer> values = new CopyOnWriteArrayList<>();
    values.add(1);
    values.add(2);

    Iterator<Integer> iter = values.iterator();

    values.add(3);
    values.add(4);

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
}
