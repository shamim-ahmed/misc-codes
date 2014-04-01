package edu.buet.cse.ocjp2014.jdbc;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;

/**
 * An example of inserting a row using CachedRowSet
 *
 * @author shamim
 */
public class CachedRowSetApp3 {

  public static void main(String... args) {
    try (CachedRowSet crs = new CachedRowSetImpl()) {
      crs.setUrl("jdbc:mysql://localhost:3306/coffee_shop?relaxAutoCommit=true");
      crs.setUsername("root");
      crs.setPassword("admin");
      crs.setCommand("SELECT * FROM COFFEES");
      crs.execute();

      crs.moveToInsertRow();
      crs.updateString("COF_NAME", "Arabica");
      crs.updateInt("SUP_ID", 150);
      crs.updateDouble("PRICE", 2.5);
      crs.updateInt("SALES", 0);
      crs.updateInt("TOTAL", 0);
      crs.insertRow();
      crs.moveToCurrentRow();
      crs.acceptChanges();   // THIS LINE IS CRUCIAL
    
      System.out.println("Row added successfully");
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
