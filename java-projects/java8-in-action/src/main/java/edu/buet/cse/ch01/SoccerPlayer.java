package edu.buet.cse.ch01;

public class SoccerPlayer implements Player {
  private final String name;
  
  public SoccerPlayer(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
}
