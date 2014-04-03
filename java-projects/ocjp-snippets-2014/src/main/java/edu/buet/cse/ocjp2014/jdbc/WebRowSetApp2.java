package edu.buet.cse.ocjp2014.jdbc;

import com.sun.rowset.WebRowSetImpl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import javax.sql.rowset.WebRowSet;

/**
 * Example of reading an xml file into a WebRowSet
 * @author shamim
 */
public class WebRowSetApp2 {
  private static final String FILE_NAME = "/home/shamim/personal/temp/coffees.xml";
  
  public static void main(String... args) {
    try (WebRowSet wrs = new WebRowSetImpl();
         BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
      wrs.readXml(reader);
      
      while (wrs.next()) {
        System.out.println(wrs.getString("COF_NAME"));
      }
    } catch (SQLException | IOException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
