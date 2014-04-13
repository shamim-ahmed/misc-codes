package edu.buet.cse.ocjp2014.mockexam;

/**
 * What happens when you interrupt another thread ?
 * WARNING: This program will never terminate.
 * 
 * @author shamim
 * 
 */
public class InterruptTrial {
  public static void main(String... args) {
    Thread t = new Thread(new MyRunnable());
    t.start();
    
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
    
    t.interrupt();
  }

  private static class MyRunnable implements Runnable {
    @Override
    public void run() {
      System.out.println("MyRunnable");

      while (true) {
        // here be dragons
      }
    }
  }
}
