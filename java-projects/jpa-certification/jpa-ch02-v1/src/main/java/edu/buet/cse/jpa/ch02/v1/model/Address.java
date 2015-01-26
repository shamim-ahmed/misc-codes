package edu.buet.cse.jpa.ch02.v1.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * This class demonstrates the following:
 * <ul>
 * <li>Transient annotation</li>
 * <li>Use of AccessType.PROPERTY</li>
 * </ul>
 * 
 * @author shamim
 *
 */
@Entity
@Table(name = "ADDRESS")
@Access(AccessType.PROPERTY)
public class Address {
  private Long id;
  private String street;
  private String city;
  private String state;
  private String zip;
  private String country;
  private Integer version;
  private boolean isResidential;

  // NOTE: When you specify GenerationType.IDENTITY, your database must be able to auto-generate values.
  // For MySQL, this is enabled by specifying AUTO_INCREMENT in column definition
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "STREET", nullable = false)
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  @Column(name = "CITY")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Column(name = "STATE", nullable = false)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Column(name = "ZIP", length = 4, nullable = false)
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Column(name = "COUNTRY", nullable = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Version
  @Column(name = "VERSION", nullable = false)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Transient
  public boolean isResidential() {
    return isResidential;
  }

  public void setResidential(boolean isResidential) {
    this.isResidential = isResidential;
  }

  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("id", id)
           .append("street", street)
           .append("city", city)
           .append("state", state)
           .append("zip", zip)
           .append("country", country);
    
    return builder.toString();
  }
}
