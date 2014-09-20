package edu.buet.cse.ch01;

import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Transaction {
  private final double amount;
  private final Currency currency;

  public Transaction(double amount, Currency currency) {
    if (Double.doubleToLongBits(amount) < Double.doubleToLongBits(0.0)) {
      throw new IllegalArgumentException(String.format("Invalid value for amount: %.2f", amount));
    }
    
    this.amount = amount;
    this.currency = Objects.requireNonNull(currency);
  }
  
  public double getAmount() {
    return amount;
  }

  public Currency getCurrency() {
    return currency;
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(ToStringStyle.MULTI_LINE_STYLE);
    builder.append("amount", amount).append("currency", currency);
    return builder.toString();
  }
}
