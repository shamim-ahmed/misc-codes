package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
public class RegexTrial2 {

  public static void main(String... args) {
    String source = "This is a test";
    String[] values = source.split("\\b");

    for (String s : values) {
      System.out.printf("\"%s\"%n", s);
    }
  }
}
