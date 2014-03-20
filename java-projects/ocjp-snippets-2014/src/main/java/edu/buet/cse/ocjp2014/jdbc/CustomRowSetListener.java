/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.buet.cse.ocjp2014.jdbc;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

/**
 *
 * @author shamim
 */
public class CustomRowSetListener implements RowSetListener {

  @Override
  public void rowSetChanged(RowSetEvent event) {
    System.out.println("row set changed !!");
  }

  @Override
  public void rowChanged(RowSetEvent event) {
    System.out.println("row changed !!");
  }

  @Override
  public void cursorMoved(RowSetEvent event) {
    System.out.println("The cursor has moved !!");
  }
}
