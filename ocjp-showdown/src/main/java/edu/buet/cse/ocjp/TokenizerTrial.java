package edu.buet.cse.ocjp;

import java.util.StringTokenizer;

/**
 *
 * @author shamim
 */
public class TokenizerTrial {
  public static void main(String... args) {
    String str = "tokens\t\t\twith    tabs and \r\nnew lines";
    StringTokenizer tokenizer = new StringTokenizer(str);
    System.out.println(tokenizer.countTokens());
  }
}
