package com.shadmansakib;

import java.time.LocalDate;

public class CA2_Driver_2014310 {
  
  public static void main(String[] args) throws CloneNotSupportedException {
    
    String[] authors = {"John Doe", "R. L. Stine", "William Shakespeare", "J. K. Rowling", "Leo Tolstoy"};
    
    //creating 'two' book objects
    CA2_Book_2014310[] book = new CA2_Book_2014310[2];
    
    book[0] = new CA2_Book_2014310("book-1", CA2_Status_2014310.LIBRARY_USE_ONLY, "Taming of the Shrew",
      authors, "978-3-8274-2555-5");
    book[1] = new CA2_Book_2014310("book-2", CA2_Status_2014310.UNAVAILABLE, "Harry Potter",
      authors, "978-1-4028-9462-6");
    
    //creating 'three' magazine objects
    CA2_Magazine_2014310[] mag = new CA2_Magazine_2014310[3];
    
    mag[0] = new CA2_Magazine_2014310("mag-1", CA2_Status_2014310.UNAVAILABLE, LocalDate.parse("2017-12-01"),
      "Reader's Digest", "978-2-5028-9482-7");
    mag[1] = new CA2_Magazine_2014310("mag-2", CA2_Status_2014310.LIBRARY_USE_ONLY, LocalDate.parse("2018-06-21"),
      "Southern Living", "978-3-6021-3210-8");
    mag[2] = new CA2_Magazine_2014310("mag-3", CA2_Status_2014310.LOANABLE, LocalDate.parse("2019-01-31"),
      "The New Yorker", "978-4-4028-5182-9");
    
    
    //copying book1 to copy
    CA2_Book_2014310 copy = (CA2_Book_2014310) book[0].clone();
    
    //comparing book1 to copy
    System.out.printf("Comparing %s with %s: %d\n",
      book[0].getItemID(), copy.getItemID(), book[0].compareTo(copy));
    System.out.println("A summary is given below:");
    System.out.printf("%-18s| %s\n", book[0].getItemID(), copy.getItemID());
    System.out.printf("%-18s| %s\n", book[0].getStatus(), copy.getStatus());
    
    System.out.println();
    
    //comparing books to mag
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("Comparing %s with %s: %d\n",
          book[i].getItemID(), mag[j].getItemID(), book[i].compareTo(mag[j]));
        System.out.println("A summary is given below:");
        System.out.printf("%-18s| %s\n", book[i].getItemID(), mag[j].getItemID());
        System.out.printf("%-18s| %s\n", book[i].getStatus(), mag[j].getStatus());
        System.out.println();
      }
    }
    
    //setting status of two mag obj to Loanable
    mag[0].setStatus(CA2_Status_2014310.LOANABLE);
    mag[1].setStatus(CA2_Status_2014310.LOANABLE);
  
    //display the mag objects whose status was changed
    System.out.println("Displaying mag[0] & mag[1] after Status Change: ");
    System.out.println(mag[0].toString());
    System.out.println(mag[1].toString());
    
    //bonus - displaying a book object
    System.out.println();
    System.out.println("Displaying a book object - Bonus Code: ");
    System.out.println(book[0].toString());
  }
  
}
