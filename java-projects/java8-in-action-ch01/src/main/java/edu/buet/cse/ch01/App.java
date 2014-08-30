package edu.buet.cse.ch01;

import java.io.File;

public class App {
  public static void main(String[] args) {
    File[] hiddenFiles = new File(".").listFiles(File::isHidden);
    
    for (File f : hiddenFiles) {
      System.out.println(f);
    }
  }
}
