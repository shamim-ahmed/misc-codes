package edu.buet.cse.ocjp;

import java.util.concurrent.ConcurrentSkipListMap;

/**
 * An example usage of various methods in ConcurrentSkipListMap
 * 
 * @author shamim
 *
 */
public class ConcurrentSkipListMapTrial2 {
  public static void main(String... args) {
    ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
    map.put("A", 1);
    map.put("D", 4);
    map.put("E", 5);
    map.put("F", 6);
    
    System.out.println(map.ceilingKey("E"));
    System.out.println(map.floorKey("E"));
  }
}
