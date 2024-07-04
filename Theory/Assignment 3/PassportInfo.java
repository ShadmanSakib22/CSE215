package com.shadmansakib;

import java.awt.Color;
import java.util.Arrays;

public class PassportInfo {
  
  private String Passport_Number;
  private String First_Name;
  private String Last_Name;
  private String NID_Number;
  private String Date_OfBirth;
  private Color[][] Picture;
  
  private PassportInfo() {
    this.Passport_Number = getPassport_Number();
    this.First_Name = getFirst_Name();
    this.Last_Name = getLast_Name();
    this.NID_Number = getNID_Number();
    this.Date_OfBirth = getDate_OfBirth();
    this.Picture = getPicture();
    
  }
  
  public static PassportInfo buildPassport() {
    
    return new PassportInfo();
  }
  
  public String getPassport_Number() {
    return this.Passport_Number;
  }
  
  public void setPassport_Number(String Passport_Number) {
    this.Passport_Number = Passport_Number;
  }
  
  public String getFirst_Name() {
    return this.First_Name;
  }
  
  public void setFirst_Name(String First_Name) {
    this.First_Name = First_Name;
  }
  
  public String getLast_Name() {
    return this.Last_Name;
  }
  
  public void setLast_Name(String Last_Name) {
    this.Last_Name = Last_Name;
  }
  
  public String getNID_Number() {
    return this.NID_Number;
  }
  
  public void setNID_Number(String NID_Number) {
    this.NID_Number = NID_Number;
  }
  
  public String getDate_OfBirth() {
    return this.Date_OfBirth;
  }
  
  public void setDate_OfBirth(String Date_OfBirth) {
    this.Date_OfBirth = Date_OfBirth;
  }
  
  public Color[][] getPicture() {
    return this.Picture;
  }
  
  public void setPicture(Color[][] Picture) {
    this.Picture = Picture;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("\nPassport Info:");
    sb.append("\nPassport Number = ").append(Passport_Number);
    sb.append("\nFirst Name = ").append(First_Name);
    sb.append("\nLast Name = ").append(Last_Name);
    sb.append("\nNID Number = ").append(NID_Number);
    sb.append("\nDate Of Birth = ").append(Date_OfBirth);
    sb.append("\nPicture = ").append(Arrays.toString(Picture));
    
    return sb.toString();
  }
  
}
