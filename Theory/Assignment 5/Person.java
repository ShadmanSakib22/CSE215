package com.shadmansakib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
  
  private String PassportNumber;
  private String FirstName;
  private String LastName;
  private String NID;
  private Date DateOfBirth;
  
  public Person() {
    this.PassportNumber = getPassportNumber();
    this.FirstName = getFirstName();
    this.LastName = getLastName();
    this.NID = getNID();
    this.DateOfBirth = getDateOfBirth();
  }
  
  public String getPassportNumber() {
    return this.PassportNumber;
  }
  
  public void setPassportNumber(String PassportNumber) {
    this.PassportNumber = PassportNumber;
  }
  
  public String getFirstName() {
    return this.FirstName;
  }
  
  public void setFirstName(String FirstName) {
    this.FirstName = FirstName;
  }
  
  public String getLastName() {
    return this.LastName;
  }
  
  public void setLastName(String LastName) {
    this.LastName = LastName;
  }
  
  public String getNID() {
    return this.NID;
  }
  
  public void setNID(String NID) {
    this.NID = NID;
  }
  
  public Date getDateOfBirth() {
    return this.DateOfBirth;
  }
  
  public void setDateOfBirth(Date DateOfBirth) {
    this.DateOfBirth = DateOfBirth;
  }
  
  @Override
  public String toString() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-y");
    String date= formatter.format(this.DateOfBirth);
    return (""+this.PassportNumber + " " + ""+this.FirstName + " " + ""+this.LastName
              + " " + ""+this.NID+ " " + ""+date + "\n");
  }
}
