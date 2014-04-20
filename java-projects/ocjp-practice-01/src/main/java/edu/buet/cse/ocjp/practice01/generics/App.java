package edu.buet.cse.ocjp.practice01.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * An example of generic code
 * 
 * @author shamim
 *
 */
public class App {
  public static void main(String... args) {
    List<?> result = foo("hello", "world");
    
    for (Object obj : result) {
      System.out.println(obj);
    }
  } 
  
  @SafeVarargs
  private static <T> List<?> foo(T... items) {
    List<T> resultList = new ArrayList<>();
    
    for (T item : items) {
      resultList.add(item);
    }
    
    return resultList;
  }
}
