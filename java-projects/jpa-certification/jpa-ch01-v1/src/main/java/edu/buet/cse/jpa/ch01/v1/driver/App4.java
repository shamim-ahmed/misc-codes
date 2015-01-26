package edu.buet.cse.jpa.ch01.v1.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.buet.cse.jpa.ch01.v1.domain.Vehicle;

public class App4 {
  public static void main(String... args) {
    EntityManagerFactory factory = null;
    EntityManager em = null;
    
    try {
      factory = Persistence.createEntityManagerFactory("jpa_pu");
      em = factory.createEntityManager();
      
      TypedQuery<Vehicle> query = em.createQuery("SELECT v FROM Vehicle v WHERE v.vin LIKE '%123%'", Vehicle.class);
      Vehicle vehicle = query.getSingleResult();
      
      em.getTransaction().begin();
      Vehicle v2 = em.merge(vehicle);  // This is important
      v2.setYear(2015);
      // No need to call persist() here !
      em.getTransaction().commit();
      
      System.out.printf("%s was updated successfully%n", vehicle);
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
      
      if (em != null) {
        EntityTransaction transaction = em.getTransaction();

        if (transaction != null && transaction.isActive()) {
          transaction.rollback();
        }
      }
    } finally {
      if (em != null) {
        em.close();
      }
      
      if (factory != null) {
        factory.close();
      }
    }
  }
}
