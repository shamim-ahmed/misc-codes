package edu.buet.cse.jpa.ch02.v4.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseEntity {
  @Column(name = "CREATE_USER", nullable = false)
  protected String createUser;

  @Column(name = "CREATE_TIME", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  protected Date createTime;

  @Column(name = "UPDATE_USER")
  protected String updateUser;

  @Column(name = "UPDATE_TIME")
  @Temporal(TemporalType.TIMESTAMP)
  protected Date updateTime;

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
