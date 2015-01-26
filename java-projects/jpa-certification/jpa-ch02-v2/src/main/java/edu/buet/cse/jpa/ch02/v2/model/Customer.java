package edu.buet.cse.jpa.ch02.v2.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
  @Id
  @Column(name = "CUSTOMER_ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long customerId;

  @Column(name = "FIRST_NAME", nullable = false)
  private String firstName;
  
  @Column(name = "LAST_NAME", nullable = false)
  private String lastName;
  
  @Embedded
  private BankInfo bankInfo;

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }
  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BankInfo getBankInfo() {
    return bankInfo;
  }

  public void setBankInfo(BankInfo bankInfo) {
    this.bankInfo = bankInfo;
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("customerId", customerId)
           .append("firstName", firstName)
           .append("lastName", lastName)
           .append("bankInfo", bankInfo);
    
    return builder.toString();
  }
}
