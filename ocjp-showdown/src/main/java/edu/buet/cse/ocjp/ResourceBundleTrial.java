package edu.buet.cse.ocjp;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author shamim
 */
public class ResourceBundleTrial {
  public static void main(String... args) {
    Locale locale = new Locale("fr", "FR");
    Locale.setDefault(locale);
    ResourceBundle bundle = ResourceBundle.getBundle("edu.buet.cse.ocjp.Messages");    
    System.out.println(bundle.getString("screen.text.greeting"));
  }
}
