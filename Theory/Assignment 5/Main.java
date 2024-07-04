package com.shadmansakib;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
  public static void main(String[] args){
    
    String path = "Data\\Data.txt";
    
    Person[] person = new Person[10];
    try (
      Scanner input = new Scanner(new File(path))
    ){
      while(input.hasNext()){
        for (int i = 0; i < 10; i++) {
          person[i] = new Person();
          person[i].setPassportNumber(input.next());
          person[i].setFirstName(input.next());
          person[i].setLastName(input.next());
          person[i].setNID(input.next());
          
          Date date=new SimpleDateFormat("dd-MMM-y").parse(input.next()); //01-Jan-1955
          person[i].setDateOfBirth(date);
        }
      }
    } catch (ParseException | FileNotFoundException e) {
      e.printStackTrace();
    }
  
    SortedByDOB(person);
    System.out.println("created SortedByDOB.txt");
    
    SortedByPassport(person);
    System.out.println("created SortedByPassport.txt");
   
  }
  
  public static void SortedByPassport(Person[] person){
    
    Arrays.sort(person, Comparator.comparing(Person::getPassportNumber));
    String pathname = "SortedByPassport.txt";
    
    CreateFile(person, pathname);
  }
  
  public static void SortedByDOB(Person[] person){
    
    Arrays.sort(person, Comparator.comparing(Person::getDateOfBirth));
    String pathname = "SortedByDOB.txt";
  
    CreateFile(person, pathname);
  }
  
  public static void CreateFile(Person[] person, String pathname){
    File file = new File(pathname);
    try {
      PrintWriter pw = new PrintWriter(file);
      for (int i=0; i<10; i++){
      pw.print(person[i]);
      }
      pw.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}

    
      
  
