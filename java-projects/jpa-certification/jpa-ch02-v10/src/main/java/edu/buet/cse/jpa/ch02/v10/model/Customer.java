package edu.buet.cse.jpa.ch02.v10.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CUSTOMER_ID", updatable = false)
  private Long id;

  @Column(name = "EMAIL_ADDR", nullable = false)
  private String email;

  @Column(name = "FIRST_NAME")
  private String firstName;

  @Column(name = "LAST_NAME")
  private String lastName;
  
  // eager fetching is enabled
  @OneToMany(mappedBy = "customer", orphanRemoval = true, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
  private List<Order> orders = new ArrayList<>();
  
  @Version
  @Column(name = "VERSION")
  private Long version;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }
  
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("id", id)
      .append("email", email)
      .append("firstName", firstName)
      .append("lastName", lastName)
      .append("version", version);

    return builder.toString();
  }
}
