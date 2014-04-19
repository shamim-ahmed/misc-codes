package edu.buet.cse.ocjp;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Example to explore behavior of various methods in BlockingQueue interface
 *
 * @author shamim
 */
public class BlockingQueueTrial {

  public static void main(String[] args) {
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    Producer producer = new Producer(queue);
    Consumer consumer = new Consumer(queue);

    new Thread(producer).start();
    new Thread(consumer).start();
  }

  private static class Producer implements Runnable {

    private final BlockingQueue<Integer> queue;

    Producer(BlockingQueue<Integer> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
      try {
        queue.put(1);
        Thread.sleep(1000);
        queue.put(2);
        Thread.sleep(1000);
        queue.put(3);
      } catch (InterruptedException ex) {
        ex.printStackTrace(System.err);
      }
    }
  }

  private static class Consumer implements Runnable {

    private final BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
      try {
        System.out.println(queue.take());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
      } catch (InterruptedException ex) {
        ex.printStackTrace(System.err);
      }
    }
  }
}
