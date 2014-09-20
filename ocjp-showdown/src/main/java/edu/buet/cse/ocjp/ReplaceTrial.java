package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
public class ReplaceTrial {
  public static void main(String... args) {
    String s = "A.B.C!";
    System.out.println(s.replaceAll(".", ",").replace("!", "?"));
  }
}
