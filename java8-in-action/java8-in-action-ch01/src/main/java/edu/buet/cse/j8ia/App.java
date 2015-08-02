package edu.buet.cse.j8ia;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import edu.buet.cse.j8ia.ch01.Apple;
import edu.buet.cse.j8ia.ch01.AppleFactory;

public class App {
  public static void main(String[] args) {
    List<Apple> inventory = AppleFactory.getInventory();

    List<Apple> greenApples = filter(inventory, AppleFactory::isGreen);
    List<Apple> heavyApples = filter(inventory, AppleFactory::isHeavy);
    
    System.out.println("Green apples : " + greenApples);
    System.out.println("Heavy apples : " + heavyApples);
  }

  private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
    List<Apple> resultList = new ArrayList<>();

    for (Apple apple : inventory) {
      if (predicate.test(apple)) {
        resultList.add(apple);
      }
    }

    return resultList;
  }
}
