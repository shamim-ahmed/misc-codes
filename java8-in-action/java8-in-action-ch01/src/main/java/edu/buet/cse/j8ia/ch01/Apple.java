package edu.buet.cse.j8ia.ch01;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Apple {
  private final Color color;
  private final double weight;

  public Apple(Color color, double weight) {
    this.color = color;
    this.weight = weight;
  }

  public Color getColor() {
    return color;
  }

  public double getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("color", color).append("weight", weight);
    return builder.toString();
  }
}
