package edu.buet.cse.jpa.ch02.v3.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Embeddable
public class BankInfo {
  @Column(name = "BANK_NAME", nullable = false)
  private String bankName;
  
  @Column(name = "ACCOUNT_NUMBER", nullable = false)
  private String accountNumber;
  
  @Column(name = "ROUTING_NUMBER")
  private String routingNumber;

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("bankName", bankName)
           .append("accountNumber", accountNumber)
           .append("routingNumber", routingNumber);
    
    return builder.toString();
  }
}
