package edu.buet.cse.ocjp;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author shamim
 */
public class RandomAccessFileTrial {

  public static void main(String... args) {
    try (RandomAccessFile file = new RandomAccessFile("/home/shamim/personal/temp/trial2.txt", "rws")) {
      file.seek(20);
      String s;

      while ((s = file.readLine()) != null) {
        System.out.println(s);
      }
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
