package edu.buet.cse.ocjp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

/**
 *
 * @author shamim
 */
public class CallableStatementTrial3 {

  public static void main(String... args) {
    Properties props = new Properties();
    props.setProperty("user", "root");
    props.setProperty("password", "admin");

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ocjp_2014", props);
            CallableStatement stmt = conn.prepareCall("call get_user_count(?)")) {
      stmt.registerOutParameter(1, Types.INTEGER);
      stmt.execute();
      System.out.println(stmt.getInt(1));
    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
