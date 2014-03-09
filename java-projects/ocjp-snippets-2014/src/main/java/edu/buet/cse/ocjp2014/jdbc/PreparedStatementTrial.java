package edu.buet.cse.ocjp2014.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import java.sql.PreparedStatement;

public class PreparedStatementTrial {
  public static void main(String... args) {
    Properties dbProps = new Properties();
    dbProps.put("user", "root");
    dbProps.put("password", "admin");
    final String dbUrl = "jdbc:mysql://localhost:3306/ocjp_db";
    final String sqlQuery = "SELECT * FROM User WHERE user_id = ?";
    
    try (Connection conn = DriverManager.getConnection(dbUrl, dbProps);
         PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
      stmt.setInt(1, 1);
      ResultSet resultSet = stmt.executeQuery();
      
      while (resultSet.next()) {
        System.out.printf("%s\t%s\t%s%n", resultSet.getInt("user_id"), resultSet.getString("username"),
            resultSet.getString("email"));
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
