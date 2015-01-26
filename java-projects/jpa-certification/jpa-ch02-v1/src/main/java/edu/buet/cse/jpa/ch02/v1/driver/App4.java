package edu.buet.cse.jpa.ch02.v1.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v1.model.Order;
import edu.buet.cse.jpa.ch02.v1.model.OrderStatus;

public class App4 {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;
    
    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();
      
      Order order = new Order();
      order.setStatus(OrderStatus.NEW);
      
      entityManager.getTransaction().begin();
      entityManager.persist(order);
      entityManager.getTransaction().commit();
      
      System.out.printf("The saved order is %s%n", order);
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
