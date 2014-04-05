package edu.buet.cse.ocjp2014.concurrent;

import java.util.concurrent.Exchanger;

public class ExchangerTrial {
  public static void main(String... args) {
    Exchanger<String> messageExchanger = new Exchanger<>();
    ChatBot alice = new ChatBot("Alice", messageExchanger, new String[] {"Knock Knock !", "Alice", "The Alice from Alice in Wonderland"});
    ChatBot bob = new ChatBot("Bob", messageExchanger, new String[] {"Who's there ?", "Which Alice ?", "Alright, come in."});
    
    new Thread(alice).start();
    
    try {
      Thread.sleep(2000);
    } catch (InterruptedException ex) {
      ex.printStackTrace(System.err);
    }
    
    new Thread(bob).start();
  }
}
