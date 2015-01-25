package edu.buet.cse.jpa.ch02.v1.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@SecondaryTable(name = "CONTENT", pkJoinColumns = @PrimaryKeyJoinColumn(name = "BOOK_ID", referencedColumnName = "ID"))
public class Book {
  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "TITLE")
  private String title;

  @Column(table = "CONTENT", name = "PDF", nullable = false)
  @Lob
  @Basic(fetch = FetchType.LAZY)
  private byte[] pdf;
  
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

  public byte[] getPdf() {
    return pdf;
  }

  public void setPdf(byte[] pdf) {
    this.pdf = pdf;
  }
  
  public String toString() {
    return String.format("[id = %d, title = %s]", id, title);
  }
}
