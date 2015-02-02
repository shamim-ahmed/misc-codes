package edu.buet.cse.jpa.ch02.v9.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v9.model.Customer;
import edu.buet.cse.jpa.ch02.v9.model.Order;

public class App3 {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;

    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();

      // no lock mode is specified. The version column of customer record should
      // not change
      Customer customer = (Customer) entityManager.find(Customer.class, 1L);
      System.out.printf("The customer is : %s%n", customer);

      if (customer != null) {
        List<Order> orderList = customer.getOrders();
        System.out.println("The orders for this customer are :");
        
        for (Order order : orderList) {
          System.out.println(order);
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace(System.err);

      if (entityManager != null) {
        EntityTransaction entityTransaction = entityManager.getTransaction();

        if (entityTransaction != null && entityTransaction.isActive()) {
          entityTransaction.rollback();
        }
      }
    } finally {
      if (entityManager != null) {
        entityManager.close();
      }

      if (emFactory != null) {
        emFactory.close();
      }
    }
  }
}
