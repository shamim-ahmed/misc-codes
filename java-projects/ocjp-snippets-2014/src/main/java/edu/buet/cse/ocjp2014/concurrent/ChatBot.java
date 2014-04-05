package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.Exchanger;

public class ChatBot implements Runnable {
  private final String name;
  private final Exchanger<String> messageExchanger;
  private final String[] replies;
  
  public ChatBot(String name, Exchanger<String> messageExchanger, String[] replies) {
    this.name = name;
    this.messageExchanger = messageExchanger;
    this.replies = replies;
  }

  @Override
  public void run() {
    try {
      for (int i = 0, n = replies.length; i < n; i++) {
        String msg = messageExchanger.exchange(replies[i]);
        System.out.printf("%s received the message '%s'%n", name, msg);
        Thread.sleep(1000);
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
