package edu.buet.cse.ocjp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * An example on using SingleThreadPool
 * 
 * @author shamim
 *
 */
public class SingleThreadPoolTrial {
  public static void main(String... args) {
    ExecutorService service = Executors.newSingleThreadExecutor();

    for (int i = 0; i < 5; i++) {
      final int j = i;
      
      service.execute(new Runnable() {
        @Override
        public void run() {
          try {
            Thread.sleep(1000);
            System.out.printf("Hello World %d%n", j);
          } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
          }
        }
      });
    }

    service.shutdown();
  }
}
