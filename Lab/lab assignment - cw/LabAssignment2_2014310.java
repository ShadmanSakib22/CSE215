package com.shadmansakib;

import java.util.Scanner;

public class LabAssignment2_2014310 {
  
  //main
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    
    //taking username
    System.out.print("Please Enter Username: ");
    String username = input.nextLine();
  
    input.nextLine(); //clearing buffer
  
    //taking password
    System.out.print("Please Enter Password:");
    String password = input.nextLine();
  
  
    //call validity for username
    if (isValidUsername(username)) {
      System.out.println("Valid username.");
    } else {
      System.out.println("Invalid username.");
    }
  
    //call validity for password
    if (isValidUsername(password)) {
      System.out.println("Valid password.");
    } else {
      System.out.println("Invalid password.");
    }
    
  }
  
  //checking username
  public static boolean isValidUsername(String username) {
    {
      if (username.length() < 4) return false;                         //At least 4 characters long
      if (username.contains(" ")) return false;                        //Contains no spaces
      if (username.equals(username.toLowerCase())) return true;        //contains only lowercase
      if (username.matches("[0-9]")) return true;                //Numbers are valid
      
    }
    
    return true; //when all of our conditions are valid
  }
  
 
  
}