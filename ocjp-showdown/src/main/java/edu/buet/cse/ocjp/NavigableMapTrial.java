package edu.buet.cse.ocjp;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author shamim
 */
public class NavigableMapTrial {
  public static void main(String... args) {
    NavigableMap<String, String> myMap = new TreeMap<>();
    myMap.put("a", "apple");
    myMap.put("b", "ball");
    myMap.put("c", "cat");
    myMap.put("aa", "apple1");
    myMap.put("bb", "ball1");
    myMap.put("cc", "cat1");
    
    NavigableMap<String, String> subMap = myMap.tailMap("bb", true);
    subMap.put("d", "dog");  // THIS IS ALLOWED !!!
    System.out.println(myMap.size());
  }
}
