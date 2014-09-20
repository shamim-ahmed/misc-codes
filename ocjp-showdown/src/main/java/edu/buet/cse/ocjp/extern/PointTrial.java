package edu.buet.cse.ocjp.extern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shamim
 */
public class PointTrial {

  private static final String FILE_NAME = "/home/shamim/personal/temp/external.out";
  private static final int MAX = 5;

  public static void main(String... args) {
    List<Point> points = new ArrayList<>();

    for (int i = 0; i < MAX; i++) {
      points.add(new Point(i, i));
    }

    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
      for (Point p : points) {
        out.writeObject(p);
      }
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }

    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
      for (int i = 0; i < MAX; i++) {
        Point p = (Point) in.readObject();
        System.out.println(p);
      }
    } catch (IOException | ClassNotFoundException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
