package edu.buet.cse.spring.ch01.v4.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import edu.buet.cse.spring.ch01.v4.model.Employee;

public class EmployeeDao {
  private final JdbcTemplate jdbcTemplate;
  private final EmployeeRowMapper rowMapper = new EmployeeRowMapper();
  private final String EMPLOYEE_QUERY = "SELECT * FROM Employee WHERE id = %d";

  public EmployeeDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public Employee getEmployee(int id) {
    return jdbcTemplate.queryForObject(String.format(EMPLOYEE_QUERY, id), rowMapper);
  }
}
