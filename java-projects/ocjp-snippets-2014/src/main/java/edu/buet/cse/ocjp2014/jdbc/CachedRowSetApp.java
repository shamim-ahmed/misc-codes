package edu.buet.cse.ocjp2014.jdbc;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author shamim
 */
public class CachedRowSetApp {

  public static void main(String... args) {
    try (CachedRowSet crs = new CachedRowSetImpl()) {
      crs.setUrl("jdbc:mysql://localhost:3306/ocjp_2014");
      crs.setUsername("root");
      crs.setPassword("admin");
      crs.setCommand("SELECT * FROM Product");
      crs.execute();
      
      while (crs.next()) {
        int productId = crs.getInt("product_id");
        String name = crs.getString("name");
        boolean available = crs.getBoolean("available");
        System.out.printf("%d\t%s\t%b%n", productId, name, available);
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}


