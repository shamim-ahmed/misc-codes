package edu.buet.cse.jpa.ch02.v1.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.buet.cse.jpa.ch02.v1.model.Book;

public class App3 {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;
    
    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();
      
      TypedQuery<Book> query = entityManager.createQuery("SELECT b FROM Book b", Book.class);
      List<Book> bookList = query.getResultList();
      
      for (Book book : bookList) {
        System.out.println(book);
        System.out.printf("length of content = %d%n", book.getPdf().length);
      }
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
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
