package edu.buet.cse.jpa.ch01.v1.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

  @Id
  @Column(name = "VIN", nullable = false)
  private String vin;

  @Column(name = "MAKE", nullable = false)
  private String make;

  @Column(name = "MODEL", nullable = false)
  private String model;

  @Column(name = "MODEL_YEAR")
  private Integer year;

  @Version
  @Column(name = "VERSION")
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
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("vin", vin)
           .append("make", make)
           .append("model", model)
           .append("year", year)
           .append("version", version);
    
    return builder.toString();
  }
}
