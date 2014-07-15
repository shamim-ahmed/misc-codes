package edu.buet.cse.ocjp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author shamim
 */
public class CallableStatementTrial {

  public static void main(String... args) {
    Properties props = new Properties();
    props.setProperty("user", "root");
    props.setProperty("password", "admin");
    
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ocjp_2014", props);
            CallableStatement stmt = conn.prepareCall("call get_all_users()")) {
      ResultSet resultSet = stmt.executeQuery();
      
      while (resultSet.next()) {
        System.out.println(resultSet.getString("email"));
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
