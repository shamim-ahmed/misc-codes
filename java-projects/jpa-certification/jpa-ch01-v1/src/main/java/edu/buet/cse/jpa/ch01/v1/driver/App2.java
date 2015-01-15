package edu.buet.cse.jpa.ch01.v1.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.buet.cse.jpa.ch01.v1.Vehicle;

public class App2 {
  public static void main(String... args) {
    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;
    
    try {
      entityManagerFactory = Persistence.createEntityManagerFactory("jpa-ch01-v1");
      entityManager = entityManagerFactory.createEntityManager();
      
      TypedQuery<Vehicle> query = entityManager.createQuery("SELECT v FROM Vehicle v", Vehicle.class);
      List<Vehicle> vehicleList = query.getResultList();
      
      for (Vehicle v : vehicleList) {
        System.out.println(v);
      }
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
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
