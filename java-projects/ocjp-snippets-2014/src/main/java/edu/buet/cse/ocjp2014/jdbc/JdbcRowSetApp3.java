package edu.buet.cse.ocjp2014.jdbc;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author shamim
 */
public class JdbcRowSetApp3 {

  public static void main(String... args) {
    JdbcRowSet jdbcRs = null;
    final String query = "SELECT * FROM User";

    try {
      RowSetFactory rsFactory = RowSetProvider.newFactory();
      jdbcRs = rsFactory.createJdbcRowSet();
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
    } finally {
      if (jdbcRs != null) {
        closeQuietly(jdbcRs);
      }
    }
  }

  private static void closeQuietly(AutoCloseable acs) {
    if (acs != null) {
      try {
        acs.close();
      } catch (Exception ex) {
        // quietly ignore
      }
    }
  }
}
