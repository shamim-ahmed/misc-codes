package edu.buet.cse.ocjp2014.jdbc;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;

/**
 * Example on updating a row using a CachedRowSet
 *
 * @author shamim
 */
public class CachedRowSetApp2 {

  public static void main(String... args) {
    try (CachedRowSetImpl crs = new CachedRowSetImpl()) {
      crs.setUrl("jdbc:mysql://localhost:3306/coffee_shop?relaxAutoCommit=true");
      crs.setUsername("root");
      crs.setPassword("admin");
      crs.setCommand("SELECT * FROM COFFEES");
      crs.execute();

      while (crs.next()) {
        String coffeeName = crs.getString("COF_NAME");

        if (coffeeName.equals("Espresso")) {
          int total = crs.getInt("TOTAL");
          crs.updateInt("TOTAL", total + 1);
          crs.updateRow();
          crs.acceptChanges();
          System.out.println("Update committed successfully");
        }
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
