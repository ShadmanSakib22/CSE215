package com.shadmansakib;

import java.util.Formatter;

public abstract class CA2_LibraryItem_2014310 implements Cloneable, Comparable<CA2_LibraryItem_2014310> {
  
  private String itemID;
  private CA2_Status_2014310 status;
  
  public CA2_LibraryItem_2014310(String itemID, CA2_Status_2014310 status) {
    this.itemID = itemID;
    this.status = status;
  }
  
  public CA2_Status_2014310 getStatus() {
    return this.status;
  }
  
  public void setStatus(CA2_Status_2014310 status) {
    this.status = status;
  }
  
  public String getItemID() {
    return this.itemID;
  }
  
  @Override
  public int compareTo(CA2_LibraryItem_2014310 another) {
    
    int i = getStatus().compareTo(another.getStatus());
    if (i < 0) return -1;
    if (i > 0) return +1;
    else {
      i = getItemID().compareTo(another.getItemID());
      if (i < 0) return -1;
      if (i > 0) return +1;
    }
    return 0;
  }
  
  @Override
  public String toString() {
    Formatter f = new Formatter();
    f.format("Item ID: %s\n",this.itemID);
    f.format("Status: %s\n",this.status);
    
    return f.toString();
  }
  
}

