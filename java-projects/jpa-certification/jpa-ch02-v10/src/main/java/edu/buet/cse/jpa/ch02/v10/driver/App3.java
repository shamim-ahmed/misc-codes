package edu.buet.cse.jpa.ch02.v10.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v10.model.Customer;

public class App3 {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;

    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();

      entityManager.getTransaction().begin();
      Customer customer = (Customer) entityManager.find(Customer.class, 1L);
      if (customer != null) {
        entityManager.remove(customer);
      }
      entityManager.getTransaction().commit();

      System.out.printf("The deleted customer is : %s%n", customer);
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
