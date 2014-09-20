package edu.buet.cse.ocjp;

import java.io.IOException;

/**
 *
 * @author shamim
 */
public class Device implements AutoCloseable {

  private String header;

  public Device(String header) throws IOException {
    if (header.equals("D2")) {
      throw new IOException("Exception during init");
    }

    this.header = header;
  }

  @Override
  public void close() {
    System.out.println("closing " + header);
    throw new RuntimeException("Nasty surprise !!");
  }

  public static void main(String... args) {
    try (Device d1 = new Device("D1");
         Device d2 = new Device("D2")) {
      throw new Exception("I wanna go home");
    } catch (Exception ex) {
      Throwable[] vals = ex.getSuppressed();

      for (Throwable t : vals) {
        System.out.println("suppressed: " + t);
      }
    }
  }
}
