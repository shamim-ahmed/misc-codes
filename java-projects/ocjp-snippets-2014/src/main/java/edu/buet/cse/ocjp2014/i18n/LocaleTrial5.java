package edu.buet.cse.ocjp2014.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTrial5 {
  public static void main(String... args) {
    Locale.setDefault(Locale.FRANCE);
    
    ResourceBundle bundle = ResourceBundle.getBundle("edu.buet.cse.ocjp2014.i18n.Messages");
    System.out.println(bundle.getString("window.title"));
  }
}
