package edu.buet.cse.jpa.ch02.v8.driver;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v8.model.Customer;
import edu.buet.cse.jpa.ch02.v8.model.Order;

public class App2 {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;

    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();

      entityManager.getTransaction().begin();
      Customer customer = (Customer) entityManager.find(Customer.class, 1L, LockModeType.OPTIMISTIC_FORCE_INCREMENT);
      
      if (customer != null) {
        Order order = new Order();
        order.setPlacementTime(new Date());
        order.setPrice(15.00);
        order.setCustomer(customer);
        customer.getOrders().add(order);
        entityManager.persist(order);
      }
      
      entityManager.getTransaction().commit();

      System.out.printf("The updated customer is : %s%n", customer);
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
