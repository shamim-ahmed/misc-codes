package edu.buet.cse.jpa.ch01.v4.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.buet.cse.jpa.ch01.v4.domain.Vehicle;

public class App {
  public static void main(String... args) {
    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;
    
    try {
      entityManagerFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = entityManagerFactory.createEntityManager();
      
      // create a new vehicle and save it
      Vehicle vehicle = new Vehicle();
      vehicle.setVin("v12345");
      vehicle.setMake("Sedan");
      vehicle.setModel("Toyota");
      vehicle.setVersion(1);
      vehicle.setYear(2014);
      
      entityManager.getTransaction().begin();
      entityManager.persist(vehicle);
      entityManager.getTransaction().commit();
      
      System.out.printf("%s was saved successfully%n", vehicle);
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
      
      if (entityManager != null && entityManager.getTransaction() != null) {
        entityManager.getTransaction().rollback();
      }
    } finally {
      if (entityManager != null) {
        entityManager.close();
      } 
      
      if (entityManagerFactory != null) {
        entityManagerFactory.close();
      }
    }
  }
}
