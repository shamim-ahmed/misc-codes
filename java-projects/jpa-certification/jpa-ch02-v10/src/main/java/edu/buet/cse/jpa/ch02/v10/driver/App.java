package edu.buet.cse.jpa.ch02.v10.driver;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v10.model.Customer;
import edu.buet.cse.jpa.ch02.v10.model.Order;

public class App {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;

    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();

      Customer customer = new Customer();
      customer.setEmail("shamim.buet.99@gmail.com");
      customer.setFirstName("shamim");
      customer.setLastName("Ahmed");

      Order order1 = new Order();
      order1.setCustomer(customer);
      order1.setPlacementTime(new Date());
      order1.setPrice(100.00);
      customer.getOrders().add(order1);

      Order order2 = new Order();
      order2.setPlacementTime(new Date());
      order2.setPrice(15.0);
      order2.setCustomer(customer);
      customer.getOrders().add(order2);

      entityManager.getTransaction().begin();
      entityManager.persist(customer);
      entityManager.getTransaction().commit();

      System.out.printf("The saved customer is : %s%n", customer);
    } catch (Exception ex) {
      ex.printStackTrace(System.err);

      if (entityManager != null) {
        EntityTransaction transaction = entityManager.getTransaction();

        if (transaction != null && transaction.isActive()) {
          transaction.rollback();
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
