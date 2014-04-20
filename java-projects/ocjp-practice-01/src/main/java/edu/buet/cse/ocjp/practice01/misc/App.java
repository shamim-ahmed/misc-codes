package edu.buet.cse.ocjp.practice01.misc;

/**
 * Why the f*** does this class compile ??
 * 
 * @author shamim
 *
 */
public class App {
  public static void main(String... args) {
    try {
      int i = 4;
      System.out.println(i);
    } catch (Exception ex) {
      throw ex;
    }
  }
}
