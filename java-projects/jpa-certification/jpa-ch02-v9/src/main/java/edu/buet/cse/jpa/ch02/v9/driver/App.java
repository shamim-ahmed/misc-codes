package edu.buet.cse.jpa.ch02.v9.driver;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v9.model.Customer;
import edu.buet.cse.jpa.ch02.v9.model.Order;

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
      
      Order order = new Order();
      order.setCustomer(customer);
      order.setPlacementTime(new Date());
      order.setPrice(100.00);
      customer.getOrders().add(order);
      
      entityManager.getTransaction().begin();
      entityManager.persist(customer);
      entityManager.getTransaction().commit();
      
      System.out.printf("The saved order is : %s%n", order);
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
