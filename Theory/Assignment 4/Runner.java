package com.shadmansakib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Runner {
  
  public static int count = 1;
  
  public static void main(String[] args) {
    
    NSUTeachers[] teachers = new NSUTeachers[3]; //assuming no more than 3 teachers
    for (int i = 0; i < 3; i++) {
      teachers[i] = new NSUTeachers(count++);
  
      teachers[i].setFullName(generateName());
      teachers[i].setNID(generateNumbers());
      teachers[i].setDateOfBirth(generateBirthdate());
      teachers[i].returnID();
    }
    
    NSUer[] students = new NSUer[3]; //assuming no more than 3 Student
    for (int i = 0; i < 3; i++) {
      students[i] = new NSUer(count++);
    
      students[i].setFullName(generateName());
      students[i].setNID(generateNumbers());
      students[i].setDateOfBirth(generateBirthdate());
      students[i].returnID();
    }
    
    NSUStaff[] staffs = new NSUStaff[3]; //assuming no more than 3 Staff
    for (int i = 0; i < 3; i++) {
      staffs[i] = new NSUStaff(count++);
  
      staffs[i].setFullName(generateName());
      staffs[i].setNID(generateNumbers());
      staffs[i].setDateOfBirth(generateBirthdate());
      staffs[i].returnID();
    }
    
    //display student/teacher/staff info.....Displaying First of each category
    System.out.println(teachers[0].toString());
    System.out.println(students[0].toString());
    System.out.println(staffs[0].toString());
  }
  
  //some random generation methods.
  public static String generateName() {
    //choosing name randomly from 10 hardcoded names.
    String[] names = {"Jon Jones","Daniel Cormier","Anderson Silva","Georges St-Pierre","Kamaru Usman",
      "Ronda Rousey","Joanna Jedrzejczyk","Weili Zhang","Valentina Shevchenko","Amanda Nunes"};
    
    Random random = new Random();
    int i = random.nextInt(names.length);
    return names[i];
  } //will choose from 10 hardcoded names
  public static String generateNumbers() {
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    String Digits = "0123456789";
    
    for (int i = 0; i < 10; i++) {
      sb.append(Digits.charAt(random.nextInt(Digits.length())));
    }
    return sb.toString();
  } //will create random 10 digit number
  public static String generateBirthdate() {
    Random random = new Random();
    
    int min = (int) LocalDate.of(1940, 1, 1).toEpochDay(); //Birthdate>=1940
    int max = (int) LocalDate.of(2001, 1, 1).toEpochDay(); //Birthdate<=2000
    long Birthdate = min + random.nextInt(max - min);
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-y");
    return dtf.format(LocalDate.ofEpochDay(Birthdate));
  } //will generate random birthdate (from assignment 3)
}
