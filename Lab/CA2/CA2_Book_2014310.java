package com.shadmansakib;

import java.util.Formatter;

public class CA2_Book_2014310 extends CA2_LibraryItem_2014310 {
  
  private String title;
  private String[] Author;
  private String ISBN;
  
  public CA2_Book_2014310(String itemID, CA2_Status_2014310 status, String title, String[] Author, String ISBN) {
    super(itemID, status);
    this.title = title;
    this.Author = Author;
    this.ISBN = ISBN;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public String[] getAuthor() {
    return this.Author;
  }
  
  public String getISBN() {
    return this.ISBN;
  }
  
  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }
  
  @Override
  public String toString() {
    String item = super.toString();
    Formatter f = new Formatter();
  
    f.format("List of Authors: ");
    for (int i=0;i<getAuthor().length;i++){
      f.format("%s",this.Author[i]);
      if(i!=getAuthor().length-1)
        f.format(", ");else f.format(".");
    }
    
    f.format("\n\n%s",item);
    f.format("Title: %s\n", getTitle());
    f.format("ISBN: %s\n",getISBN());
    
    return f.toString();
  }
  
}
