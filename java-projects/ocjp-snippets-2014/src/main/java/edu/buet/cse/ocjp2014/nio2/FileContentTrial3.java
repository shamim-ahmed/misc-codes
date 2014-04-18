package edu.buet.cse.ocjp2014.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Reading the content of a file using the methods in Files class
 * 
 * @author shamim
 */
public class FileContentTrial3 {
  public static void main(String... args) {
    Path path = FileSystems.getDefault().getPath("/", "home/shamim", "personal/temp/hello.txt");
    
    try (ByteChannel channel = Files.newByteChannel(path)) {
      ByteBuffer buffer = ByteBuffer.allocate(10);
      int count;
      
      while ((count = channel.read(buffer)) != -1) {
        buffer.rewind();
        
        for(int i = 0; i < count; i++) {
          System.out.print((char) buffer.get());
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
