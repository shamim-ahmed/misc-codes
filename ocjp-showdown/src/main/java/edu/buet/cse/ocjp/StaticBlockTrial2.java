package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */
public class StaticBlockTrial2 {
  static {
    System.out.println("in static block...");
  }

  {
    System.out.println("in non-static block...");
  }
  
  public static void main(String... args) {
    StaticBlockTrial2 t;
    System.out.println("in main()");
    t = new StaticBlockTrial2();
    System.out.println("main() ends");
  }
}
