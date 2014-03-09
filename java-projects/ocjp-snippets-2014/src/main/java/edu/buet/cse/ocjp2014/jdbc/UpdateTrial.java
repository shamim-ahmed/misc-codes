package edu.buet.cse.ocjp2014.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UpdateTrial {
  public static void main(String... args) {
    Properties dbProps = new Properties();
    dbProps.put("user", "root");
    dbProps.put("password", "admin");
    final String dbUrl = "jdbc:mysql://localhost:3306/ocjp_db";
    final String sqlQuery = "SELECT * FROM Product";
    
    try (Connection conn = DriverManager.getConnection(dbUrl, dbProps);
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
      ResultSet resultSet = stmt.executeQuery(sqlQuery);
      
      // print initial values
      System.out.println("---Before update---");
      printResultSet(resultSet);
      
      // rewind and modify
      resultSet.beforeFirst();
      
      while (resultSet.next()) {
        resultSet.updateBoolean("available", true);
        resultSet.updateRow(); // THIS LINE IS CRUCIAL
      }
      
      // print updated values
      resultSet.beforeFirst();
      System.out.println("\n---After update---");
      printResultSet(resultSet);
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
  
  private static void printResultSet(ResultSet resultSet) throws SQLException {
    while (resultSet.next()) {
      System.out.printf("%s\t%b%n", resultSet.getString("name"), resultSet.getBoolean("available"));
    }
  }
}
