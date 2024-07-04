//Name: Shadman Sakib - ID: 2014310642 - CSE 215.12 - Assignment 2 - Spring 2021

package com.shadmansakib;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Solution02 {
  public static void main(String[] args) {
    //number of cities taking for the table: 5 min - 15 max -- 1.(f)
    int size = (int) ((Math.random() * (15 - 5)) + 5);
    System.out.println("Random number of cities to generate between (5-15): "+size);
    
    System.out.println("Generating City Names...");
    
    String[] CityNames = new String[size];
    CityNames[0] = "" + generateCityName();
    for (int i = 1; i < size; i++) {
      //calling string builder method according to 'size' to populate cityNames array -- 1.(c)
      CityNames[i] = "" + generateCityName();
      
      //using .equals to make sure elements of array are not identical to each other -- 1.(e)
      if (CityNames[i].equals(CityNames[i-1]))
        i--;
    }
    System.out.println("\nCity Names Array Created: " + Arrays.toString(CityNames));
    
    //calling method that formulates the distance -- 1(a)
    System.out.println("\nFormulating distance between cities...");
    generateDistance(CityNames);
  
    //calling method that displays the table -- 1(b)
    System.out.println("Displaying Distance Table...\n");
    displayTable(CityNames, generateDistance(CityNames));
    
    //Calling method that choose random name from hardcoded list -- 1.(d)
    System.out.println("\nChoosing random name from hardcoded list...");
    System.out.println("Random name chosen: " + chooseOne());
    
  }
  
  public static int[][] generateDistance(String[] CityNames) {
    
    int size = CityNames.length;
    int[][] distance = new int[size][size];    //creating 2D array of appropriate size
    
    for (int i = 0; i < distance.length; i++) {
      for (int j = 0; j < distance.length; j++) {
        distance[i][j] = (int) ((Math.random() * (90 - 50)) + 50);    //max = 90 miles; min = 50 miles;
      }
    }
    //Distance between cities A to B is the same as distance between cities B to A
    for (int i = 0; i < distance.length; i++) {
      for (int j = 0; j < distance.length; j++) {
        distance[i][j] = distance[j][i];
      }
    }
    //Distance between cities A to A is always 0. Elements in right diagonal of the matrix = 0;
    for (int i = 0; i < distance.length; i++) {
      for (int j = 0; j < distance.length; j++) {
        if (i == j) {
          distance[i][j] = 0;
        }
      }
    }
    return distance;
  }
  
  public static void displayTable(String[] CityNames, int[][] distance) {
    
    String[][] table = new String[distance.length + 1][distance.length + 1];
    table[0][0] = "";
    
    //horizontal city names
    for (int j = 1; j < table.length; j++) {
      table[0][j] = CityNames[j - 1];
    }
    //vertical city names
    for (int i = 1; i < table.length; i++) {
      table[i][0] = CityNames[i - 1];
    }
    //fill rest
    for (int i = 1; i < table.length; i++) {
      for (int j = 1; j < table.length; j++) {
        table[i][j] = String.valueOf(distance[i - 1][j - 1]);  //converted int arr to string arr
      }
    }
    //print the string array with 20 char wide formatting
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table.length; j++) {
        System.out.printf("%20s|", table[i][j]);
      }
      System.out.println();
    }
    
  }
  
  public static StringBuilder generateCityName() {
    
    StringBuilder cityName = new StringBuilder();
    Random generate = new Random();
    
    int size = generate.nextInt(6) + 5; //min 5 chars, max 10 chars
    
    String letters = "abcdefghijklmnopqrstuvwxyz"; //all available char to choose from
    
    char[] temp = new char[size];
    //storing randomly chosen values to the temp array
    for (int i = 0; i < size; i++) {
      temp[i] = letters.charAt(generate.nextInt(letters.length()));
    }
    //prints city name generated
    for (char row : temp) cityName.append(row);
    System.out.println(cityName);
    
    return cityName;
  }
  
  public static String chooseOne() {
    //taking just 5 names instead of 250 to allocate for time.
    String[] names = {"Dhaka", "Rangpur", "Barisal", "Sylhet", "Rajshahi"};
    Random choose = new Random();
    int chooseName = choose.nextInt(names.length);
    
    return names[chooseName];
  }
  
}