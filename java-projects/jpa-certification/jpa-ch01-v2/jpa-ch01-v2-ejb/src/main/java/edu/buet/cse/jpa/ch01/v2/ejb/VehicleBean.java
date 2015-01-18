package edu.buet.cse.jpa.ch01.v2.ejb;

import java.util.List;

import javax.ejb.Local;

import edu.buet.cse.ch01.v2.domain.Vehicle;

@Local
public interface VehicleBean {
  void createVehicle(Vehicle vehicle);
  List<Vehicle> getVehicleList(String make);
  Vehicle updateVehicle(Vehicle vehicle);
  void deleteVehicle(Vehicle vehicle);
}
