package edu.buet.cse.ocjp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author shamim
 */
public class ResultSetTrial {
  public static void main(String... args) {
    Properties props = new Properties();
    props.setProperty("user", "root");
    props.setProperty("password", "admin");
    
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ocjp_2014", props);
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
      ResultSet resultSet = stmt.executeQuery("SELECT * FROM User");
      resultSet.moveToInsertRow();
      resultSet.updateString("username", "clark");
      resultSet.updateString("email", "clark.kent@gmail.com");
      resultSet.insertRow();
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
