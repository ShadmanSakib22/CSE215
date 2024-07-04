package com.shadmansakib;

import java.util.Formatter;

public class NSUer extends Person implements Student {
  
  public int Count;
  
  public NSUer(int Count) {
    this.Count = Count;
  }
  
  @Override
  public String returnID() {
    return String.valueOf(this.Count);
  }
  
  @Override
  public String CanEnroll() {
    return "Yes";
  }
  
  @Override
  public String Occupation() {
    return "Student";
  }
  
  public String toString() {
    String student = super.toString();
    Formatter f = new Formatter(new StringBuilder());
    f.format("%s",student);
    f.format("%s %s\n", "Can Enroll:", CanEnroll());
    f.format("%s %s\n", "NSU ID:", returnID());
    return f.toString();
  }
}
