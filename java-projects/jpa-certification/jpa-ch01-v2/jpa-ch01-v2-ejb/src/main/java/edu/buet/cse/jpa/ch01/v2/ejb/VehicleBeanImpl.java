package edu.buet.cse.jpa.ch01.v2.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.buet.cse.ch01.v2.domain.Vehicle;

@Stateless
public class VehicleBeanImpl implements VehicleBean {
  @PersistenceContext(unitName = "jpa_pu")
  private EntityManager entityManager;
  
  @Override
  public void createVehicle(Vehicle vehicle) {
    entityManager.persist(vehicle);
  }

  @Override
  public List<Vehicle> getVehicleList(String make) {
    TypedQuery<Vehicle> query = entityManager.createQuery("SELECT v FROM Vehicle v WHERE v.make = ?1", Vehicle.class);
    query.setParameter(1, make);
    return query.getResultList();
  }

  @Override
  public Vehicle updateVehicle(Vehicle vehicle) {
    entityManager.persist(vehicle);
    return vehicle;
  }

  @Override
  public void deleteVehicle(Vehicle vehicle) {  
    entityManager.remove(vehicle);
  }
}
