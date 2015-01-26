package edu.buet.cse.jpa.ch02.v1.driver;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v1.model.PreferredCustomer;

public class App5 {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;
    
    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();
      
      PreferredCustomer customer = new PreferredCustomer();
      customer.setExpirationDate(new Date());
      
      entityManager.getTransaction().begin();
      entityManager.persist(customer);
      entityManager.getTransaction().commit();
      
      System.out.printf("The saved customer is %s%n", customer);
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
