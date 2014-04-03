package edu.buet.cse.ocjp2014.jdbc;

import com.sun.rowset.WebRowSetImpl;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.sql.rowset.WebRowSet;

/**
 * Example of writing the content of a WebRowSet to an XML file
 * @author shamim
 */
public class WebRowSetApp {

  private static final String FILE_NAME = "/home/shamim/personal/temp/coffees.xml";

  public static void main(String... args) {
    try (WebRowSet wrs = new WebRowSetImpl();
         BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(FILE_NAME)))) {
      wrs.setUrl("jdbc:mysql://localhost:3306/coffee_shop");
      wrs.setUsername("root");
      wrs.setPassword("admin");
      wrs.setCommand("SELECT * FROM COFFEES");
      wrs.execute();
      wrs.writeXml(out);
      
      System.out.printf("Result written in %s%n", FILE_NAME);
    } catch (SQLException | IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
