package edu.buet.cse.jpa.ch02.v7.driver;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v7.model.Address;
import edu.buet.cse.jpa.ch02.v7.model.Customer;

public class App {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;
    
    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();
      
      Customer customer = new Customer();
      customer.setCreationTime(new Date());
      customer.setEmail("shamim.buet.99@gmail.com");
      
      Address address = new Address();
      address.setStreet("8 Wishart Street");
      address.setCity("Sydney");
      address.setState("NSW");
      address.setCountry("AU");
      address.setPostCode("2122");
            
      entityManager.getTransaction().begin();
      entityManager.persist(customer);
      entityManager.getTransaction().commit();
      
      entityManager.getTransaction().begin();
      address.setId(customer.getId());
      customer.setAddress(address);
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
