package edu.buet.cse.ocjp2014.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;

public class SavePointTrial2 {
  public static void main(String... args) {
    Properties dbProps = new Properties();
    dbProps.put("user", "root");
    dbProps.put("password", "admin");
    final String dbUrl = "jdbc:mysql://localhost:3306/ocjp_db";
    final String sqlQuery = "SELECT * FROM User WHERE user_id = 2";
    
    try (Connection conn = DriverManager.getConnection(dbUrl, dbProps);
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
      conn.setAutoCommit(false);   // NOTE THIS
      ResultSet resultSet = stmt.executeQuery(sqlQuery);
      
      while (resultSet.next()) {
        resultSet.updateString("email", "derek123@yahoo.com");
        resultSet.updateRow();
      }
      
      Savepoint firstSavepoint = conn.setSavepoint();
      
      // now rewind and update again
      resultSet.beforeFirst();
      
      while (resultSet.next()) {
        resultSet.updateString("email", "derek456@sandstone.com.au");
      }
      
      Savepoint secondSavePoint = conn.setSavepoint();
      
      conn.rollback(secondSavePoint);  // this will have no effect
      conn.rollback(firstSavepoint);   // this will rollback the second change
      
      //conn.commit();
      
      System.out.println("The program completes... but no change is committed !");
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
