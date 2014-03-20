package edu.buet.cse.ocjp2014.jdbc;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.rowset.JdbcRowSet;

/**
 *
 * @author shamim
 */
public class JdbcRowSetApp {
  public static void main(String... args) {
    final String query = "SELECT * FROM User";
    
    Properties credentials = new Properties();
    credentials.put("user", "root");
    credentials.put("password", "admin");
    
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocjp_2014", credentials)) {
      JdbcRowSet jdbcRs = new JdbcRowSetImpl(conn);
      jdbcRs.setCommand(query);
      jdbcRs.execute();
      
      while (jdbcRs.next()) {
        int id = jdbcRs.getInt("user_id");
        String username = jdbcRs.getString("username");
        String email = jdbcRs.getString("email");
        System.out.printf("%d\t%s\t%s%n", id, username, email);
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
