package com.shadmansakib;

import java.util.Formatter;

public abstract class Person {
  
  private String FullName;
  private String NID;
  private String DateOfBirth;
  
  public Person() {
    this.FullName = getFullName();
    this.NID = getNID();
    this.DateOfBirth = getDateOfBirth();
  }
  
  public String getFullName() {
    return this.FullName;
  }
  public void setFullName(String FullName) {
    this.FullName = FullName;
  }
  
  public String getNID() {
    return NID;
  }
  public void setNID(String NID) {
    this.NID = NID;
  }
  
  public String getDateOfBirth() {
    return DateOfBirth;
  }
  public void setDateOfBirth(String DateOfBirth) {
    this.DateOfBirth = DateOfBirth;
  }
  
  public abstract String Occupation();
  
  @Override
  public String toString() {
    Formatter f = new Formatter(new StringBuilder());
    f.format("%s %s\n", "Name:", this.FullName);
    f.format("%s %s\n", "NID:", this.NID);
    f.format("%s %s\n", "BirthDate:", this.DateOfBirth);
    f.format("%s %s\n", "Occupation:", Occupation());
    return f.toString();
  }
}
