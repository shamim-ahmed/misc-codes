package edu.buet.cse.ocjp;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * What happens when you attempt to repeatedly schedule a faulty task ?
 *
 * @author shamim
 */
public class ExecutorServiceTrial {

  public static void main(String... args) {
    ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
    service.scheduleAtFixedRate(new MyRunnable(), 1, 2, TimeUnit.SECONDS);
    
    try {
      Thread.sleep(10000);
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
    
    service.shutdown();
  }

  private static class MyRunnable implements Runnable {
    public void run() {
      int i = 0;
      System.out.println(10 / i);
    }
  }
}
