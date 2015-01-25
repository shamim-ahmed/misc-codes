package edu.buet.cse.jpa.ch01.v4.domain;

public class Vehicle {
  private String vin;
  private String make;
  private String model;
  private Integer year;
  private Integer version;

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return String.format("[vin = '%s', make = '%s', model = '%s', year = %d, version = %d]", vin, make, model, year, version);
  }
}
