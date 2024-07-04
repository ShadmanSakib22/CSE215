package com.shadmansakib;

import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import java.util.Scanner;

public class GenerateRandomPassportInfo {
  
  public static String ChooseName() {
    //choosing name randomly from 50 hardcoded names. using this method for both first and last name.
    String[] names = {"Ava", "Amelia", "Abigail", "Alexander", "Aiden", "Anthony",
      "Belle", "Belva", "Ben", "Benedict", "Benita", "Benito",
      "Caitlyn", "Casandra", "Caleb", "Callisto", "Callie", "Calvin",
      "Daren", "Daria", "Darin", "Dario", "Darius", "Darla",
      "Emma", "Evelyn", "Emily", "Elijah", "Ethan ", "Ezra",
      "Luna", "Layla", "Lily", "Liam", "Lucas", "Logan",
      "Sophia", "Scarlett", "Stella", "Sebastian", "Samuel", "Santiago",
      "Hannah", "Hannele", "Hans", "Harlan", "Harland", "Harley", "Harmony", "Harold"};
    
    Random random = new Random();
    int i = random.nextInt(names.length);
    return names[i];
  }
  
  public static String generateNID() {
    StringBuilder sb = new StringBuilder();
    //using StringBuilder to randomly generate NID Number as instructed in the question.
    Random random = new Random();
    String FirstDigit = "123456789";
    String Digits = "0123456789";
  
    sb.append(FirstDigit.charAt(random.nextInt(FirstDigit.length())));
    
    for (int i = 1; i < 10; i++) {
      sb.append(Digits.charAt(random.nextInt(Digits.length())));
    }
    return sb.toString();
    
    /* FirstDigit.length() sets the bound for random
       Digits.length() sets the bound for random
       This method selects chars randomly from FirstDigit and Digits String one at a time.
       The for loop makes the sb.append add the remaining 9 chars whose range is 0-9.
       First element range was 1-9.
     */

  }
  
  public static String generatePassportNumber() {
    
    StringBuilder sb = new StringBuilder();
    //using StringBuilder to randomly generate PassportNumber as instructed in the question.
    Random random = new Random();
    String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Digits = "0123456789";
    
    for (int i = 0; i < 2; i++) {
      sb.append(CapitalLetters.charAt(random.nextInt(CapitalLetters.length())));
    }
    for (int i = 2; i < 9; i++) {
      sb.append(Digits.charAt(random.nextInt(Digits.length())));
    }
    return sb.toString();
    
    /*Same concept as generateNID. Only this time we have 2 for loops.
    First for loop is to populate first 2 chars which are Capital Letters
    Other loop is to populate remaining 7 chars which are digits.
    */
    
  }
  
  public static String generateBirthdate() {
    
    Random random = new Random();
    
    int min = (int) LocalDate.of(1940, 1, 1).toEpochDay(); //Birthdate>=1940
    int max = (int) LocalDate.of(2001, 1, 1).toEpochDay(); //Birthdate<=2000
    long Birthdate = min + random.nextInt(max - min);
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-y");
    
    return dtf.format(LocalDate.ofEpochDay(Birthdate));
    
    /*LocalDate 1940-1-1 is converted to EpochDay, which is saved as int min.
      LocalDate 2001-1-1 is converted to EpochDay, which is saved as int min.
      Birthdate is long, because it might exceed int range.
      Used DateTimeFormatter to assign pattern for LocalDate
      Lastly we convert the EpochDay value of Birthdate to LocalDate,
      and then dtf.format implements the pattern
     */
  }
  
  public static Color[][] generatePicture() {
    
    Color[][] picture = new Color[40][50];
    int row, col;
    Random random = new Random();
    
    for (col = 0; col < 40; col++) {
      for (row = 0; row < 50; row++) {
        //range 0-255
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        Color randomColor = new Color(r, g, b);
        picture[col][row] = randomColor;
      }
    }
    
    return picture;
    //Self Explanatory, range is selected randomly from 0-255. Values passed to constructor. Array populated.
    //Stumbled upon this method, while watching swing tutorials. Thought it would work here too.
  }
  
  
  public static String[] All_NID_Numbers = new String[15];
  public static String[] All_Passport_Numbers = new String[15];
  
  public static void Builder(PassportInfo[] obj) {
    
    //Assigning PassportNumber
    obj[0].setPassport_Number(generatePassportNumber());
    All_Passport_Numbers[0] = obj[0].getPassport_Number();
    for (int i = 1; i < 15; i++) {
      obj[i].setPassport_Number(generatePassportNumber());
      All_Passport_Numbers[i] = obj[i].getPassport_Number();
      if (All_Passport_Numbers[i].equals(All_Passport_Numbers[i - 1])) {
        i--;
        System.out.println("Existing Passport Number Generated! Recreating Passport Number..");
      }
      /*Assigned first element outside loop,
        so i can compare current element and previous element, to make sure i am not adding dupes.
        Not full proof method, but limits chance of dupe significantly.
      */
    }
    
    //Assigning First Name, Last Name, Date and Picture
    for (int i = 0; i < 15; i++) {
      obj[i].setFirst_Name(ChooseName());
      obj[i].setLast_Name(ChooseName());
      obj[i].setDate_OfBirth(generateBirthdate());
      obj[i].setPicture(generatePicture());
    }
    
    //Assigning NID
    obj[0].setNID_Number(generateNID());
    All_NID_Numbers[0] = obj[0].getNID_Number();
    for (int i = 1; i < 15; i++) {
      obj[i].setNID_Number(generateNID());
      All_NID_Numbers[i] = obj[i].getNID_Number();
      if (All_NID_Numbers[i].equals(All_NID_Numbers[i - 1])) {
        All_NID_Numbers[i] = null ;
      }
    }
    /*
    Same as earlier, null is added as array element as Multiple passport can have same NID. Null is filler.
    Could remove null from array, but that would make the code tedious.
     */
    
  }
  
  public static void main(String[] args) {
    
    System.out.println("Program Begins...");
    
    //Creating 15 Passport Holders.
    PassportInfo[] obj = new PassportInfo[15];
    for (int i = 0; i < 15; i++) {
      obj[i] = PassportInfo.buildPassport();
    }
    
    //calling method that assigns all the information
    Builder(obj);
    
    //Displaying 15 NIDs that were Assigned.
    System.out.println("Display NIDs: ");
    for (int i=0; i<15; i++) {
      System.out.printf("(%02d) %s.  ",i+1, All_NID_Numbers[i]);
    }
    
    //Taking user Input NID to check Passport Info.
    System.out.print("\n\nTo see Passport Info, Enter NID: ");
    Scanner input = new Scanner(System.in);
    String NID = input.nextLine();
    
    //Displaying Information
    for (int i=0; i<15; i++) {
      if (NID.equals(obj[i].getNID_Number())) { //searching the passport objects which have same attribute as NID
        System.out.println(obj[i].toString()); //loop will display all passports that have same attribute as NID
      }
    }
  }
}
