package edu.buet.cse.ocjp;

import java.util.Arrays;
import java.util.concurrent.ConcurrentSkipListSet;

public class SkipListSetTrial {

  public static void main(String[] args) {
    ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>(Arrays.asList(20, 3, 10, 4));
    System.out.println(set);
  }
}
