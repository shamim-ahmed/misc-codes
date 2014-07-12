package edu.buet.cse.ocjp.extern;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shamim
 */
public class Point implements Externalizable {
  private int x;
  private int y;
  
  public Point() {
    this(0, 0);
  }
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("(").append(x).append(",").append(y).append(")");
    return sb.toString();
  }
 
  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeUTF(toString());
  }
  
  @Override
  public void readExternal(ObjectInput in) throws IOException {
    String s = in.readUTF();
    Pattern p = Pattern.compile("\\((\\d+),(\\d+)\\)");
    Matcher m = p.matcher(s);
    if (m.matches()) {
      x = Integer.parseInt(m.group(1));
      y = Integer.parseInt(m.group(2));
    }
  }
}
