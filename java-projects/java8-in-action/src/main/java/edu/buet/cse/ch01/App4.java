package edu.buet.cse.ch01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class App4 {
  public static void main(String... args) {
    Transaction tran1 = new Transaction(105.0, Currency.USD);
    Transaction tran2 = new Transaction(50.0, Currency.USD);
    Transaction tran3 = new Transaction(2500.0, Currency.BDT);
    Transaction tran4 = new Transaction(24.0, Currency.JPY);
    
    List<Transaction> transactions = Arrays.asList(tran1, tran2, tran3, tran4);
    Map<Currency, List<Transaction>> result = transactions.stream()
          .filter((Transaction t) -> t.getAmount() > 100.0)
          .collect(groupingBy(Transaction::getCurrency));
    
    System.out.println(result);
  }
}
