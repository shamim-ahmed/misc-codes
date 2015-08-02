package edu.buet.cse.j8ia;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import edu.buet.cse.j8ia.ch01.Apple;
import edu.buet.cse.j8ia.ch01.Color;
import edu.buet.cse.j8ia.ch01.AppleUtils;

public class App2 {
  public static void main(String... args) {
    List<Apple> inventory = AppleUtils.getInventory();

    List<Apple> greenApples = filter(inventory, (Apple a) -> Color.GREEN.equals(a.getColor()));
    List<Apple> heavyApples =
        filter(inventory,
            (Apple a) -> Double.doubleToLongBits(a.getWeight()) >= Double.doubleToLongBits(150.0));
    
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
