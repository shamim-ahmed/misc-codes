package edu.buet.cse.generator_11678;

import java.io.PrintStream;
import java.util.Random;

public class App {
  private static final String LINE_SEPARATOR = "\n";
  private static final String SPACE = " ";
  
  private static final int NUMBER_OF_CASES = 2;
  private static final int MAX_NO_OF_CARDS = 100;
  private static final int MAX_CARD_VALUE = 1000;

  public static void main(String[] args) {
    generate(System.out);
  }

  private static void generate(PrintStream outputStream) {
    StringBuilder resultBuilder = new StringBuilder();
    Random randomGenerator = new Random();

    for (int i = 0; i < NUMBER_OF_CASES; i++) {
      final int m = 1 + randomGenerator.nextInt(MAX_NO_OF_CARDS);
      final int n = 1 + randomGenerator.nextInt(MAX_NO_OF_CARDS);

      resultBuilder.append(m).append(SPACE).append(n).append(LINE_SEPARATOR);
      int[] aliceValues = new int[m];
      int[] bettyValues = new int[n];

      for (int j = 0; j < aliceValues.length; j++) {
        aliceValues[j] = 1 + randomGenerator.nextInt(MAX_CARD_VALUE);
        resultBuilder.append(aliceValues[j]);

        if (j < aliceValues.length - 1) {
          resultBuilder.append(SPACE);
        }
      }

      resultBuilder.append(LINE_SEPARATOR);

      for (int j = 0; j < bettyValues.length; j++) {
        bettyValues[j] = 1 + randomGenerator.nextInt(MAX_CARD_VALUE);
        resultBuilder.append(bettyValues[j]);

        if (j < bettyValues.length - 1) {
          resultBuilder.append(SPACE);
        }
      }

      resultBuilder.append(LINE_SEPARATOR);
    }

    resultBuilder.append(0).append(SPACE).append(0);
    outputStream.print(resultBuilder.toString());
  }
}
