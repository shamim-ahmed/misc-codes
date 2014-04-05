package edu.buet.cse.ocjp2014.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTrial7 {
  public static void main(String... args) {
    ResourceBundle bundle = ResourceBundle.getBundle("edu.buet.cse.ocjp2014.i18n.ArtExhibition", Locale.JAPANESE);
    System.out.println(bundle.getString("window.title"));
  }
}
