package edu.buet.cse.j8ia.ch01;

import java.util.ArrayList;
import java.util.List;

public class AppleFactory {
  private static Color[] COLORS = {Color.RED, Color.GREEN, Color.BROWN, Color.RED, Color.BROWN};
  private static double[] WEIGHTS = {125.0, 120.0, 145.0, 150.0, 175.0};
  
  public static List<Apple> getInventory() {
    List<Apple> appleList = new ArrayList<>();
    
    for (int i = 0; i < COLORS.length; i++) {
      appleList.add(new Apple(COLORS[i], WEIGHTS[i]));
    }
    
    return appleList;
  }
  
  public static boolean isGreen(Apple apple) {
    return Color.GREEN.equals(apple.getColor());
  }
  
  public static boolean isHeavy(Apple apple) {
    return Double.doubleToLongBits(apple.getWeight()) >= Double.doubleToLongBits(150.0);
  }
  
  private AppleFactory() {
  }
}
