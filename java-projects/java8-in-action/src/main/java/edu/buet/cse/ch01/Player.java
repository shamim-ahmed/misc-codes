package edu.buet.cse.ch01;

public interface Player {
  default void play() {
    System.out.println("I am playing...");
  }
}
