package edu.buet.cse.ocjp;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author shamim
 */
public class RandomAccessFileTrial2 {

  public static void main(String... args) {
    try (RandomAccessFile file = new RandomAccessFile(new File("/home/shamim/personal/temp/trial2.txt"), "rws");
            FileChannel channel = file.getChannel()) {
      ByteBuffer buffer = ByteBuffer.allocate(10);
      int n;
      
      while ((n = channel.read(buffer)) != -1) {
        buffer.rewind();
        
        for (int i = 0; i < n; i++) {
          System.out.print((char) buffer.get());
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
