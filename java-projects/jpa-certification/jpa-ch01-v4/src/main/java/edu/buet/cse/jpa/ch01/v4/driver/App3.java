package edu.buet.cse.jpa.ch01.v4.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.buet.cse.jpa.ch01.v4.domain.Vehicle;

public class App3 {
  public static void main(String... args) {
    EntityManagerFactory factory = null;
    EntityManager em = null;
    
    try {
      factory = Persistence.createEntityManagerFactory("jpa_pu");
      em = factory.createEntityManager();
      
      TypedQuery<Vehicle> query = em.createNamedQuery("selectVehiclesByMake", Vehicle.class);
      query.setParameter(1, "sedan");
      List<Vehicle> vehicleList = query.getResultList();
      
      System.out.printf("Total no of results: %d%n", vehicleList.size());
      
      for (Vehicle v : vehicleList) {
        System.out.println(v);
      }
    } catch (Exception ex) {
      ex.printStackTrace(System.err);
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
