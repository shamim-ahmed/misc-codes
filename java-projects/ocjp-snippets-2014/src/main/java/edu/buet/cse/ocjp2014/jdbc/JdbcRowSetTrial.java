package edu.buet.cse.ocjp2014.jdbc;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetTrial {
  public static void main(String... args) {
    Properties authProps = new Properties();
    authProps.put("user", "root");
    authProps.put("password", "admin");
    final String dbUrl = "jdbc:mysql://localhost:3306/ocjp_db";
    final String sqlQuery = "SELECT * FROM User";

    try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
      rowSet.setUrl(dbUrl);
      rowSet.setUsername("root");
      rowSet.setPassword("admin");
      rowSet.setCommand(sqlQuery);

      rowSet.execute();

      while (rowSet.next()) {
        System.out.printf("%d\t%s\t%s%n", rowSet.getInt("user_id"), rowSet.getString("username"),
            rowSet.getString("email"));
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
