package edu.buet.cse.ocjp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shamim
 */
public class GenericsTrial2 {
  public static void main(String... args) {
    Map<?, ?> myMap = new HashMap<>();
    // Map<?, ?> myMap2 = new HashMap<?, ?>();   // COMPILER ERROR  !!!
    Map<?, ?> myMap3 = new HashMap<Object, Object>();
    Map<?, Object> myMap4 = new HashMap<Object, Object>();
    
    List<?> myList = new ArrayList<>();
    // List<?> myList2 = new ArrayList<?>();  // COMPILER ERROR !!!
  }
}
