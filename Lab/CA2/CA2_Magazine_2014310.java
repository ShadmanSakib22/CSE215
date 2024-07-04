package com.shadmansakib;

import java.time.LocalDate;
import java.util.Formatter;

public class CA2_Magazine_2014310 extends CA2_LibraryItem_2014310 {
  
  private LocalDate issuedAt;
  private String name;
  private String ISBN;
  
  public CA2_Magazine_2014310(String itemID, CA2_Status_2014310 status, LocalDate issuedAt, String name, String ISBN) {
    super(itemID, status);
    this.issuedAt = issuedAt;
    this.name = name;
    this.ISBN = ISBN;
  }
  
  public LocalDate getIssuedAt() {
    return this.issuedAt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getISBN() {
    return this.ISBN;
  }
  
  @Override
  public String toString() {
    String item = super.toString();
    Formatter f = new Formatter();
    f.format("%s",item);
    f.format("Name: %s\n", getName());
    f.format("Issued At: %s\n",getIssuedAt());
    f.format("ISBN: %s\n",getISBN());
    
    return f.toString();
  }
  
}
