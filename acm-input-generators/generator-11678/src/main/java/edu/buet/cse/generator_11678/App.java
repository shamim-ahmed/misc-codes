package edu.buet.cse.generator_11678;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

public class App {
  private static final String LINE_SEPARATOR = "\n";
  private static final String SPACE = " ";

  private static final int NUMBER_OF_CASES = 16;
  private static final int MAX_NO_OF_CARDS = 1000;
  private static final int MAX_CARD_VALUE = 10000;

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
      }

      for (int j = 0; j < bettyValues.length; j++) {
        bettyValues[j] = 1 + randomGenerator.nextInt(MAX_CARD_VALUE);
      }

      Arrays.sort(aliceValues);
      Arrays.sort(bettyValues);

      appendValues(aliceValues, resultBuilder);
      appendValues(bettyValues, resultBuilder);
    }

    resultBuilder.append(0).append(SPACE).append(0);
    outputStream.print(resultBuilder.toString());
  }

  private static void appendValues(int[] values, StringBuilder resultBuilder) {
    for (int j = 0; j < values.length; j++) {
      resultBuilder.append(values[j]);

      if (j < values.length - 1) {
        resultBuilder.append(SPACE);
      }
    }

    resultBuilder.append(LINE_SEPARATOR);
  }
}
