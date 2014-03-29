package edu.buet.cse.ocjp2014.i18n;

import java.util.ListResourceBundle;

public class ArtExhibition_de extends ListResourceBundle {
  @Override
  public Object[][] getContents() {
    return new Object[][] {
        {"window.title", "Hallo Welt"},
        {"window.color", "rot"}
    };
  }
}
