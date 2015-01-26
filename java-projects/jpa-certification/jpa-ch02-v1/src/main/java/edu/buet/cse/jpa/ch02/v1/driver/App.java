package edu.buet.cse.jpa.ch02.v1.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v1.model.Address;

public class App {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;
    
    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();
      
      Address address = new Address();
      address.setStreet("8 Wishart Street");
      address.setCity("Sydney");
      address.setZip("2122");
      address.setState("NSW");
      address.setCountry("AU");
      address.setResidential(true);
      
      entityManager.getTransaction().begin();
      entityManager.persist(address);
      entityManager.getTransaction().commit();
      
      System.out.printf("The saved address is: %s%n", address);
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
