package edu.buet.cse.jpa.ch02.v6.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "USER", uniqueConstraints = { @UniqueConstraint(columnNames = { "USER_NAME", "EMAIL_ADDR" }) })
@TableGenerator(name = "userIdGenerator", table = "SEQUENCE_GENERATOR_TBL", 
                pkColumnName = "SEQUENCE_NAME", pkColumnValue = "user_id_seq", 
                valueColumnName = "SEQUENCE_VALUE", initialValue = 1, allocationSize = 1)
public class User {
  @Id
  @Column(name = "ID", updatable = false)
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "userIdGenerator")
  private Long id;
  
  @Column(name = "USER_NAME", nullable = false, length = 50)
  private String username;
  
  @Column(name = "EMAIL_ADDR", nullable = false, length = 50)
  private String email;
  
  @Column(name = "FIRST_NAME", length = 50)
  private String firstName;
  
  @Column(name = "LAST_NAME", length = 50)
  private String lastName;

  @Column(name = "DATE_OF_BIRTH")
  @Temporal(TemporalType.DATE)
  private Date dateOfBirth;
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
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

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("id", id)
           .append("username", username)
           .append("email", email)
           .append("firstName", firstName)
           .append("lastName", lastName);
    
    return builder.toString();
  }
}
