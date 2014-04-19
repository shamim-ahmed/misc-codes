package edu.buet.cse.ocjp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * An example usage of Future
 * 
 * @author shamim
 *
 */
public class FutureTrial {
  public static void main(String... args) {
    ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
    Future<String> future = service.schedule(new Callable<String>() {
      @Override
      public String call() {
        return "hello world";
      }
    }, 10, TimeUnit.SECONDS);
    
    try {
      System.out.printf("The result is %s%n", future.get());
    } catch (InterruptedException | ExecutionException ex) {
      ex.printStackTrace(System.err);
    }
    
    service.shutdown();
  }
}
