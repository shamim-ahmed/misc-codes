package edu.buet.cse.jpa.ch02.v1.driver;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch02.v1.model.Book;

public class App2 {
  public static void main(String... args) {
    EntityManagerFactory emFactory = null;
    EntityManager entityManager = null;

    try {
      emFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = emFactory.createEntityManager();

      Book book = new Book();
      book.setTitle("A Study in Scarlet");
      book.setPdf(getPdfContent());

      entityManager.getTransaction().begin();
      entityManager.persist(book);
      entityManager.getTransaction().commit();
      
      System.out.printf("The book %s was created successfully%n", book);
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

  private static byte[] getPdfContent() {
    byte[] result = null;

    try (InputStream in = new BufferedInputStream(App2.class.getResourceAsStream("/edu/buet/cse/jpa/ch02/v1/test.pdf"));
        ByteArrayOutputStream out = new ByteArrayOutputStream()) {
      byte[] buffer = new byte[1024];
      int count;

      while ((count = in.read(buffer)) != -1) {
        out.write(buffer, 0, count);
      }

      result = out.toByteArray();
    } catch (IOException ex) {
      ex.printStackTrace(System.err);
    }

    return result;
  }
}
