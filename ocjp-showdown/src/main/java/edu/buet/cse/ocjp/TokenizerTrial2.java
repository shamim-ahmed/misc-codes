package edu.buet.cse.ocjp;

import java.util.StringTokenizer;

/**
 *
 * @author shamim
 */
public class TokenizerTrial2 {
  public static void main(String... args) {
    String source = "DoDELIMNotDELIMDoDELIMThis";
    StringTokenizer tokenizer = new StringTokenizer(source, "DELIM");
    
    while (tokenizer.hasMoreTokens()) {
      System.out.println(tokenizer.nextToken());
    }
  }
}
