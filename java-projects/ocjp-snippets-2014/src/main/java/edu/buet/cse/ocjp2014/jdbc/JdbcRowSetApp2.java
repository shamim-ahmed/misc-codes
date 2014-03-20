package edu.buet.cse.ocjp2014.jdbc;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;

/**
 *
 * @author shamim
 */
public class JdbcRowSetApp2 {
  public static void main(String... args) {
    final String query = "SELECT * FROM User";
    
    try (JdbcRowSet jdbcRs = new JdbcRowSetImpl()) {
      jdbcRs.setUrl("jdbc:mysql://localhost:3306/ocjp_2014");
      jdbcRs.setUsername("root");
      jdbcRs.setPassword("admin");
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
