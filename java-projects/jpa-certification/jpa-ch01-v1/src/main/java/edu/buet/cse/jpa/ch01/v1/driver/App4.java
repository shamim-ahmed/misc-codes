package edu.buet.cse.jpa.ch01.v1.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.buet.cse.jpa.ch01.v1.Vehicle;

public class App4 {
  public static void main(String... args) {
    EntityManagerFactory factory = null;
    EntityManager em = null;
    
    try {
      factory = Persistence.createEntityManagerFactory("jpa-ch01-v1");
      em = factory.createEntityManager();
      
      TypedQuery<Vehicle> query = em.createQuery("SELECT v FROM Vehicle v WHERE v.vin LIKE '%123%'", Vehicle.class);
      Vehicle vehicle = query.getSingleResult();
      
      em.getTransaction().begin();
      vehicle.setYear(2015);
      em.persist(vehicle);
      em.getTransaction().commit();
      
      System.out.printf("%s was updated successfully%n", vehicle);
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
      em.getTransaction().rollback();
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
