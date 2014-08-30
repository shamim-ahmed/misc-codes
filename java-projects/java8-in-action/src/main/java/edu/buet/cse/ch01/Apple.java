package edu.buet.cse.ch01;

import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Apple {
  public static final double WEIGHT_THRESHOLD = 150.0;
  private final Color color;
  private final double weight;
  
  public Apple(Color color, double weight) {
    this.color = Objects.requireNonNull(color);
    
    if (Double.doubleToLongBits(weight) <= Double.doubleToLongBits(0.0)) {
      throw new IllegalArgumentException(String.format("invalid value for weight: %.2f", weight));
    }
    
    this.weight = weight;
  }

  public Color getColor() {
    return color;
  }

  public double getWeight() {
    return weight;
  }
  
  public boolean isGreen() {
    return color == Color.GREEN;
  }
  
  public boolean isHeavy() {
    return Double.doubleToLongBits(weight) > Double.doubleToLongBits(WEIGHT_THRESHOLD);
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("color", color).append("weight", weight);
    return builder.toString();
  }
}
