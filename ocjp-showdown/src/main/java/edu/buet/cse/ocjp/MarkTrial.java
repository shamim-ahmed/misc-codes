package edu.buet.cse.ocjp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author shamim
 */
public class MarkTrial {
  public static void main(String... args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("/home/shamim/personal/temp/ocjp-source/namelist.txt"))) {
      System.out.println(reader.readLine());
      reader.mark(100);
      System.out.println(reader.readLine());
      reader.reset();
      System.out.println(reader.readLine());
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
    
  }
}
