package edu.buet.cse.ocjp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author shamim
 */
public class JoinRowSetTrial {

  public static void main(String... args) {
    Properties props = new Properties();
    props.put("user", "root");
    props.put("password", "admin");

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ocjp_2014", props);) {
      RowSetFactory factory = RowSetProvider.newFactory();
      CachedRowSet studentRowSet = factory.createCachedRowSet();
      studentRowSet.setCommand("SELECT SID, NAME FROM STUDENT");
      studentRowSet.execute(conn);

      CachedRowSet enrolmentRowSet = factory.createCachedRowSet();
      enrolmentRowSet.setCommand("SELECT SID, SUBJECT FROM ENROLMENT");
      enrolmentRowSet.execute(conn);

      JoinRowSet joinRowSet = factory.createJoinRowSet();
      joinRowSet.addRowSet(studentRowSet, "SID");
      joinRowSet.addRowSet(enrolmentRowSet, "SID");

      while (joinRowSet.next()) {
        // NOTE THE CASE IN COLUMN NAME
        System.out.printf("%s %s %s %n", joinRowSet.getString("SID"), 
                joinRowSet.getString("name"), joinRowSet.getString("SUBJECT"));
      }

    } catch (SQLException ex) {
      ex.printStackTrace(System.err);
    }
  }
}
