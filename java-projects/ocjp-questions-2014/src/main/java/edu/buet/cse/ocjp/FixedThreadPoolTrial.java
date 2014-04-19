package edu.buet.cse.ocjp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shamim
 *
 */
public class FixedThreadPoolTrial {
  public static void main(String... args) {
    ExecutorService service = Executors.newFixedThreadPool(10);

    for (int i = 0; i < 5; i++) {
      final int j = i;

      service.execute(new Runnable() {
        @Override
        public void run() {
          try {
            Thread.sleep(2000);
          } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
          }
          
          System.out.printf("Hello World %d%n", j);
        }
      });
    }

    service.shutdown();
  }
}
