package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTrial {
  public static void main(String... args) {
    PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
    new Thread(new Consumer(queue, 5)).start();
    new Thread(new Producer(queue, 5)).start();
  }
  
  private static class Producer implements Runnable {
    private final PriorityBlockingQueue<Integer> queue;
    private final int count;
    
    Producer(PriorityBlockingQueue<Integer> queue, int count) {
      this.queue = queue;
      this.count = count;
    }
    
    @Override
    public void run() {
      for (int i = 0; i < count; i++) {
        System.out.printf("Added %d%n", i);
        queue.put(i);
      }
    }
  }
  
  private static class Consumer implements Runnable {
    private final PriorityBlockingQueue<Integer> queue;
    private final int count;
    
    Consumer(PriorityBlockingQueue<Integer> queue, int count) {
      this.queue = queue;
      this.count = count;
    }
    
    @Override
    public void run() {
      try {
        for (int i = 0; i < count; i++) {
          int n = queue.take();
          System.out.printf("Consumed %d%n", n);
        }
      } catch (InterruptedException ex) {
        ex.printStackTrace(System.err);
      }
    }
  }
}
