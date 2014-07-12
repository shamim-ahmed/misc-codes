package edu.buet.cse.ocjp;

/**
 *
 * @author shamim
 */

class Demo {
  static {
    System.out.println("in static block...");
  }

  {
    System.out.println("in non-static block...");
  }
}

public class StaticBlockTrial {
  public static void main(String... args) {
    Demo d;
    System.out.println("in main()");
    d = new Demo();
    System.out.println("main() ends");
  }
}
