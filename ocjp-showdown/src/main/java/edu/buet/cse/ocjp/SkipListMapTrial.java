package edu.buet.cse.ocjp;

import java.util.concurrent.ConcurrentSkipListMap;

/**
 *
 * @author shamim
 */
public class SkipListMapTrial {
  public static void main(String... args) {
    ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
    map.put(50, "apple");
    map.put(25, "orange");
    map.put(3, "peach");
    map.put(12, "banana");
    map.put(30, "strawberry");
    
    System.out.println(map);
  }
}
