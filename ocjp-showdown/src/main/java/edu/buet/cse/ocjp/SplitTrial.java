package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
public class SplitTrial {
  public static void main(String... args) {
    String s = "name:john;;age:34;;;;;";
    System.out.println(s.split(";").length);
  }
}
