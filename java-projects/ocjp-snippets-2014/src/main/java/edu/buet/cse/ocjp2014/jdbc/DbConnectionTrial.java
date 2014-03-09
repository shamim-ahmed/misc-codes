package edu.buet.cse.ocjp2014.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbConnectionTrial {
  public static void main(String... args) {
    Properties authProps = new Properties();
    authProps.put("user", "root");
    authProps.put("password", "admin");
    final String dbUrl = "jdbc:mysql://localhost:3306/ocjp_db";
    final String sqlQuery = "SELECT * FROM User";

    try (Connection conn = DriverManager.getConnection(dbUrl, authProps); Statement stmt = conn.createStatement()) {
      ResultSet resultSet = stmt.executeQuery(sqlQuery);

      while (resultSet.next()) {
        System.out.printf("%s\t%s\t%s%n", resultSet.getInt("user_id"), resultSet.getString("username"),
            resultSet.getString("email"));
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
