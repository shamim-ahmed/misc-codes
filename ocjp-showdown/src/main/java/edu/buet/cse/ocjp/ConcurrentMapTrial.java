package edu.buet.cse.ocjp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author shamim
 */
public class ConcurrentMapTrial {
  public static void main(String... args) {
    Map<String, String> myMap = new ConcurrentHashMap<>();
    myMap.put(null, "hello");
  }
}
