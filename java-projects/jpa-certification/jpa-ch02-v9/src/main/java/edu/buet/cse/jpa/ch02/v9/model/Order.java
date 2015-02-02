package edu.buet.cse.jpa.ch02.v9.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "ORDERS")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ORDER_ID", updatable = false)
  private Long id;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "PLACEMENT_TIME", nullable = false, updatable = false)
  private Date placementTime;

  @Column(name = "PRICE", nullable = false)
  private Double price;
  
  @Version
  @Column(name = "VERSION")
  private Long version;

  @ManyToOne
  @JoinColumn(name = "CUSTOMER_ID_FK", referencedColumnName = "CUSTOMER_ID")
  private Customer customer;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getPlacementTime() {
    return placementTime;
  }

  public void setPlacementTime(Date placementTime) {
    this.placementTime = placementTime;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
  
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("id", id)
      .append("placementTime", placementTime)
      .append("price", price)
      .append("version", version)
      .append("customer", customer);

    return builder.toString();
  }
}
