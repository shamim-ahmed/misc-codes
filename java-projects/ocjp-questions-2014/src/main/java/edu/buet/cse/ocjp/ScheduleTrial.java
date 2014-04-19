package edu.buet.cse.ocjp;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * An example of scheduling a faulty task and trying to cancel it later
 * 
 * @author shamim
 *
 */
public class ScheduleTrial {
  public static void main(String... args) {
    ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
    final ScheduledFuture<?> future = service.scheduleAtFixedRate(new MyRunnable(), 1, 2, TimeUnit.SECONDS);

    service.schedule(new Runnable() {
      @Override
      public void run() {
        future.cancel(true);
        System.out.println("Task canceled");
      }
    }, 10, TimeUnit.SECONDS);
    
    service.shutdown();
  }

  private static class MyRunnable implements Runnable {
    @Override
    public void run() {
      final int i = 0;
      System.out.println(10 / i);
    }
  }
}
