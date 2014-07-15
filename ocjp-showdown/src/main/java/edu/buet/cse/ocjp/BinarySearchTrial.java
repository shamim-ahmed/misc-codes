package edu.buet.cse.ocjp;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author shamim
 */
public class BinarySearchTrial {

  private static class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      return o1.length() - o2.length();
    }
  }

  public static void main(String... args) {
    String[] values = {"d", "bb", "aaaa"};
    
    System.out.println(Arrays.binarySearch(values, "a", new MyComparator()));
  }
}
