package edu.buet.cse.jpa.ch02.v2.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v2.model.BankInfo;
import edu.buet.cse.jpa.ch02.v2.model.Customer;

public class App {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;
    
    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();
      
      BankInfo bankInfo = new BankInfo();
      bankInfo.setBankName("NAB");
      bankInfo.setAccountNumber("000778001");
      bankInfo.setRoutingNumber("2241139");
      
      Customer customer = new Customer();
      customer.setFirstName("Shamim");
      customer.setLastName("Ahmed");
      customer.setBankInfo(bankInfo);
      
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
