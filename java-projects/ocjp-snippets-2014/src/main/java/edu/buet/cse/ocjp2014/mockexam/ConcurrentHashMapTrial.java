package edu.buet.cse.ocjp2014.mockexam;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Does a ConcurrentHashMap accept null as key or value ?
 * 
 * @author shamim
 * 
 */
public class ConcurrentHashMapTrial {
  public static void main(String... args) {
    ConcurrentHashMap<Integer, String> myMap = new ConcurrentHashMap<>();

    try {
      myMap.put(null, "shamim");
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
    }

    try {
      myMap.put(1, null);
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
    }
  }
}
