package edu.buet.cse.ocjp2014.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ColumnAliasTrial {
  public static void main(String... args) {
    Properties dbProps = new Properties();
    dbProps.put("user", "root");
    dbProps.put("password", "admin");
    final String dbUrl = "jdbc:mysql://localhost:3306/ocjp_db";
    final String sqlQuery = "SELECT user_id, email AS email_addr FROM User";
    
    try (Connection conn = DriverManager.getConnection(dbUrl, dbProps);
         Statement stmt = conn.createStatement()) {
      ResultSet resultSet = stmt.executeQuery(sqlQuery);
      
      while (resultSet.next()) {
        System.out.printf("%s\t%s%n", resultSet.getString("user_id"), resultSet.getString("email_addr"));
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
