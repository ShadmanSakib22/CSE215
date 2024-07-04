package com.shadmansakib;
import java.util.Scanner;

public class LabAssignment1_2014310642 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int id;
    String name;
    String major;
    
    
    //taking id
    System.out.print("Enter Your ID: ");
    id = input.nextInt();
  
    input.nextLine(); //clearing buffer
    
    //taking name
    System.out.print("Enter Your Name: ");
    name = input.nextLine();
    
    //taking major
    System.out.print("Enter Your Major Information: ");
    major = input.nextLine();
    
  
    //outputs
    System.out.println("Your ID is: " + id);
    System.out.println("Your name is: " + name);
    
    //switch statement
    switch(major)
    {
      case "C I":
        System.out.println("Computer Science and Engineering Freshmen");
        break;
      case "C II":
        System.out.println("Computer Science and Engineering Sophomore");
        break;
      case "C III":
        System.out.println("Computer Science and Engineering Junior");
        break;
      case "C IV":
        System.out.println("Computer Science and Engineering Sophomore Senior");
        break;
      default:
        System.out.println("Error! Unknown Input.");
    }
    
    
  }
  
}
