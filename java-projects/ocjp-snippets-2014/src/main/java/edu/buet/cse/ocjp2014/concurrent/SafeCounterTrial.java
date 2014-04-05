package edu.buet.cse.ocjp2014.concurrent;

public class SafeCounterTrial {
  public static void main(String... args) {
    SafeCounter counter = new SafeCounter();
    new Thread(new Incrementer(counter)).start();
    new Thread(new Incrementer(counter)).start();
  }

  private static class Incrementer implements Runnable {
    private final SafeCounter counter;

    Incrementer(SafeCounter counter) {
      this.counter = counter;
    }

    @Override
    public void run() {
      for (int i = 0; i < 5; i++) {
        System.out.printf("%s : %d%n", Thread.currentThread().getName(), counter.increment());

        try {
          Thread.sleep(1000);
        } catch (InterruptedException ex) {
          ex.printStackTrace(System.err);
        }
      }
    }
  }
}
