package com.shadmansakib;

import java.util.Formatter;

public class NSUTeachers extends Person implements Teacher{
  public int Count;
  
  public NSUTeachers(int Count) {
    this.Count = Count;
  }
  
  @Override
  public String returnID() {
    return String.valueOf(this.Count);
  }
  
  @Override
  public String CanTeach() {
    return "Yes";
  }
  
  @Override
  public String Occupation() {
    return "Teacher";
  }
  
  public String toString() {
    String teacher = super.toString();
    Formatter f = new Formatter(new StringBuilder());
    f.format("%s",teacher);
    f.format("%s %s\n", "Can Teach:", CanTeach());
    f.format("%s %s\n", "NSU ID:", returnID());
    return f.toString();
  }
  
}
