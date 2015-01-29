package edu.buet.cse.jpa.ch02.v7.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "CUSTOMER")
public class Customer extends BaseEntity {
  @Column(name = "EMAIL_ADDR", length = 50)
  private String email;

  @OneToOne(cascade = CascadeType.PERSIST)
  @PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
  private Address address;
  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("id", id)
           .append("creationTime", creationTime)
           .append("version", version)
           .append("email", email)
           .append("address", address);
    
    return builder.toString();
  }
}
