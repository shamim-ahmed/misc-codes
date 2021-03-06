package edu.buet.cse.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App2 {
  public static void main(String... args) {
    Apple apple1 = new Apple(Color.RED, 155.0);
    Apple apple2 = new Apple(Color.GREEN, 75.0);
    Apple apple3 = new Apple(Color.BROWN, 160.0);
    List<Apple> apples = Arrays.asList(apple1, apple2, apple3);
    
    List<Apple> greenApples = filterInventory(apples, Apple::isGreen);
    List<Apple> heavyApples = filterInventory(apples, Apple::isHeavy);
    
    System.out.println("Green apples: " + greenApples);
    System.out.println();
    System.out.println("Heavy apples: " + heavyApples);
  }
  
  private static List<Apple> filterInventory(List<Apple> inventory, Predicate<Apple> predicate) {
    List<Apple> resultList = new ArrayList<>();
    
    for (Apple apple : inventory) {
      if (predicate.test(apple)) {
        resultList.add(apple);
      }
    }
    
    return resultList;
  }
}
