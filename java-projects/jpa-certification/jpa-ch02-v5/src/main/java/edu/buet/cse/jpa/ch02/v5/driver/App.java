package edu.buet.cse.jpa.ch02.v5.driver;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v5.model.Book;

public class App {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;
    
    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();
      
      Book book = new Book();
      book.setCreateUser("admin");
      book.setCreateTime(new Date());
      book.setTitle("A Study in Scarlet");
      book.setPrice(10.0);
      
      entityManager.getTransaction().begin();
      entityManager.persist(book);
      entityManager.getTransaction().commit();
      
      System.out.printf("The saved book is : %s%n", book);
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
