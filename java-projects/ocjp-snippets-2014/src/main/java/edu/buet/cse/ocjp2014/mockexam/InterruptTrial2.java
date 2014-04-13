package edu.buet.cse.ocjp2014.mockexam;

/**
 * Another example of tricky interruption issues
 * 
 * @author shamim
 * 
 */
public class InterruptTrial2 {
  public static void main(String... args) {
    Thread t = new Thread(new MyRunnable());
    t.start();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    }

    t.interrupt();
  }

  private static class MyRunnable implements Runnable {
    @Override
    public void run() {
      System.out.println("start...");

      while (!Thread.interrupted()) {
        System.out.println("running...");
      }

      System.out.println("end...");
    }
  }
}
