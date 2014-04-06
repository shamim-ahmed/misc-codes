package edu.buet.cse.spring.ch01.v4.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buet.cse.spring.ch01.v4.jdbc.EmployeeDao;
import edu.buet.cse.spring.ch01.v4.model.Employee;

public class JdbcApp {
  public static void main(String[] args) {
    try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("/edu/buet/cse/spring/ch01/v4/spring-beans.xml")) {
      EmployeeDao dao = appContext.getBean("employeeDao", EmployeeDao.class);
      Employee employee = dao.getEmployee(1);
      System.out.println(employee);
    }
  }
}
