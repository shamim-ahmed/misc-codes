package edu.buet.cse.ocjp;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * An example usage of FutureTask
 * 
 * @author shamim
 *
 */
public class FutureTaskTrial {
  public static void main(String... args) {
    ExecutorService service = Executors.newCachedThreadPool();
    FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
      @Override
      public String call() throws Exception {
        Thread.sleep(5000);
        return "hello world";
      }
    });
    
    service.execute(futureTask);

    try {
      System.out.println(futureTask.get());
    } catch (ExecutionException | InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
    
    service.shutdown();
  }
}
