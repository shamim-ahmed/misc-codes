package edu.buet.cse.jpa.ch01.v3.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.buet.cse.jpa.ch01.v3.domain.Vehicle;

public class App2 {
  public static void main(String... args) {
    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;
    
    try {
      entityManagerFactory = Persistence.createEntityManagerFactory("jpa_pu");
      entityManager = entityManagerFactory.createEntityManager();
      
      TypedQuery<Vehicle> query = entityManager.createNamedQuery("selectAllVehicles", Vehicle.class);
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
