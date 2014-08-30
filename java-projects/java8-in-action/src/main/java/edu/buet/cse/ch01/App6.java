package edu.buet.cse.ch01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App6 {
  public static void main(String... args) {
    Apple apple1 = new Apple(Color.GREEN, 75.0);
    Apple apple2 = new Apple(Color.RED, 155.0);
    Apple apple3 = new Apple(Color.BROWN, 160.0);
    List<Apple> apples = Arrays.asList(apple1, apple2, apple3);
    
    List<Apple> resultList = apples.parallelStream().filter((Apple a) -> a.getColor() == Color.BROWN)
        .collect(Collectors.toList());
    System.out.println(resultList);
  }
}
