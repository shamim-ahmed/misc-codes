package edu.buet.cse.ocjp2014.i18n;

import java.util.ListResourceBundle;

public class ArtExhibition extends ListResourceBundle {
  @Override
  public Object[][] getContents() {
    return new Object[][] {
        {"window.title", "Hello World"},
        {"window.color", "Red"}
    };
  }
}
