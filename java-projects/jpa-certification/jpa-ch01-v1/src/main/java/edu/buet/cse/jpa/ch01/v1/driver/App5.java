package edu.buet.cse.jpa.ch01.v1.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.buet.cse.jpa.ch01.v1.domain.Vehicle;

public class App5 {
  public static void main(String... args) {
    EntityManagerFactory factory = null;
    EntityManager em = null;

    try {
      factory = Persistence.createEntityManagerFactory("jpa-ch01-v1-pu");
      em = factory.createEntityManager();

      TypedQuery<Vehicle> query = em.createQuery("SELECT v FROM Vehicle v WHERE v.vin = ?1", Vehicle.class);
      query.setParameter(1, "v12345");

      Vehicle vehicle = query.getSingleResult();

      em.getTransaction().begin();
      em.remove(vehicle);
      em.getTransaction().commit();

      System.out.printf("%s has been deleted successfully%n", vehicle);
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
