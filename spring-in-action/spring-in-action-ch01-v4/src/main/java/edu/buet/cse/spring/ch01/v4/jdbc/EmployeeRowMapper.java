package edu.buet.cse.spring.ch01.v4.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.buet.cse.spring.ch01.v4.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

  @Override
  public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
    Employee employee = new Employee();
    employee.setId(resultSet.getInt("id"));
    employee.setFirstName(resultSet.getString("first_name"));
    employee.setLastName(resultSet.getString("last_name"));
    employee.setEmailAddress(resultSet.getString("email"));
    employee.setJoinDate(resultSet.getDate("join_date"));
    
    return employee;
  }

}
