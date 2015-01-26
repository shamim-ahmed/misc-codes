package edu.buet.cse.jpa.ch02.v1.model;

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

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * This entity class demonstrates the usage of Temporal annotation
 * 
 * @author shamim
 *
 */
@Entity
@Table(name = "PREFERRED_CUSTOMER")
@TableGenerator(name = "customerIdGenerator", table = "SEQUENCE_GENERATOR_TBL", 
                pkColumnName = "SEQUENCE_NAME", pkColumnValue = "cust_id_seq", 
                valueColumnName = "SEQUENCE_VALUE", initialValue = 1, allocationSize = 1)
public class PreferredCustomer {
  @Id
  @Column(name = "ID", updatable = false)
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "customerIdGenerator")
  private Long id;

  @Column(name = "EXPIRE_DATE", nullable = false)
  @Temporal(TemporalType.DATE)
  private Date expirationDate;
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("id", id)
           .append("expirationDate", expirationDate);
    
    return builder.toString();
  }
}
