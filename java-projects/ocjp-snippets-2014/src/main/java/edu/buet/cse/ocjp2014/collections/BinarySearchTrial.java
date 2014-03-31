package edu.buet.cse.ocjp2014.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTrial {
  public static void main(String... args) {
    List<String> myList = new ArrayList<>(Arrays.<String>asList("aa", "ab", "ba", "bb"));
    Comparator<String> comparator = new ReverseComparator();
    Collections.sort(myList, comparator);
    
    String target = "ab";
    int index = Collections.binarySearch(myList, target, comparator);
    System.out.printf("%s contains %s at position %d%n", myList, target, index);
  }
  
  private static class ReverseComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t) {
      return t.compareToIgnoreCase(s);
    }
  }
}
