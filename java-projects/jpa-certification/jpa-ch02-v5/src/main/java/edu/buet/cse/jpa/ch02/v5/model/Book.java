package edu.buet.cse.jpa.ch02.v5.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "BOOK")
@AttributeOverrides({ @AttributeOverride(name = "createUser", column = @Column(name = "CREATOR", nullable = false)),
    @AttributeOverride(name = "createTime", column = @Column(name = "CREATE_TS", nullable = false)),
    @AttributeOverride(name = "updateUser", column = @Column(name = "UPDATER")),
    @AttributeOverride(name = "updateTime", column = @Column(name = "UPDATE_TS")) })
public class Book extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;

  @Column(name = "TITLE", nullable = false)
  protected String title;

  @Column(name = "PRICE", nullable = false)
  protected Double price;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("createUser", createUser)
           .append("createTime", createTime)
           .append("updateUser", updateUser)
           .append("updateTime", updateTime)
           .append("title", title)
           .append("price", price);

    return builder.toString();
  }
}
