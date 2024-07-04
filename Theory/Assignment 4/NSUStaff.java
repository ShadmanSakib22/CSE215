package com.shadmansakib;

import java.util.Formatter;

public class NSUStaff extends Person implements Student,Teacher{
  public int Count;
  
  public NSUStaff(int Count) {
    this.Count = Count;
  }
  
  @Override
  public String returnID() {
    return String.valueOf(this.Count);
  }
  
  @Override
  public String CanEnroll() {
    return "Eligible";
  }
  
  @Override
  public String CanTeach() {
    return "Eligible";
  }
  
  @Override
  public String Occupation() {
    return "Staff";
  }
  
  public String toString() {
    String staff = super.toString();
    Formatter f = new Formatter(new StringBuilder());
    f.format("%s",staff);
    f.format("%s %s\n", "Can Teach:", CanTeach());
    f.format("%s %s\n", "Can Enroll:", CanEnroll());
    f.format("%s %s\n", "NSU ID:", returnID());
    return f.toString();
  }
}
