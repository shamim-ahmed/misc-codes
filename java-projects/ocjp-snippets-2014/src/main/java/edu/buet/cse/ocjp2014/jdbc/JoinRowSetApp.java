package edu.buet.cse.ocjp2014.jdbc;

import com.sun.rowset.CachedRowSetImpl;
import com.sun.rowset.JoinRowSetImpl;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;

/**
 *
 * @author shamim
 */
public class JoinRowSetApp {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/coffee_shop";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "admin";
  
  public static void main(String... args) {
    try (CachedRowSet coffeeSet = new CachedRowSetImpl();
         CachedRowSet supplierSet = new CachedRowSetImpl();
         JoinRowSet jrs = new JoinRowSetImpl()) {
      coffeeSet.setUrl(DB_URL);
      coffeeSet.setUsername(USERNAME);
      coffeeSet.setPassword(PASSWORD);
      coffeeSet.setCommand("SELECT COF_NAME, SUP_ID FROM COFFEES");
      coffeeSet.execute();
      
      supplierSet.setUrl(DB_URL);
      supplierSet.setUsername(USERNAME);
      supplierSet.setPassword(PASSWORD);
      supplierSet.setCommand("SELECT SUP_ID, SUP_NAME FROM SUPPLIERS WHERE SUP_NAME = 'Acme, Inc.'");
      supplierSet.execute();
      
      jrs.addRowSet(coffeeSet, "SUP_ID");
      jrs.addRowSet(supplierSet, "SUP_ID");
      
      while (jrs.next()) {
        System.out.println(jrs.getString("COF_NAME"));
      } 
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
