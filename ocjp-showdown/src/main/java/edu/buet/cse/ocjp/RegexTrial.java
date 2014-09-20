package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
public class RegexTrial {
  public static void main(String... args) {
    String message = "1 dan 2 dave 3 dick";
    String[] values = message.split("\\d");
    
    for (String s : values) {
      System.out.printf("\"%s\"%n", s);
    }
  }
}
