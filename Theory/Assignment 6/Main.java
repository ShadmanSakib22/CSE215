package com.shadmansakib;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    String path = "C:\\Users\\Toast\\IdeaProjects\\Assignment 6\\Data.txt";
    
    ArrayList<Person> person = new ArrayList<>();
    try (
      Scanner input = new Scanner(new File(path))
    ) {
      while (input.hasNext()) {
        //PassportNumber, FirstName, LastName, NID, DoB (format: 01-Jan-1955)
        person.add(new Person(
          input.next(), input.next(), input.next(), input.next(),
          new SimpleDateFormat("dd-MMM-y").parse(input.next())));
        
      }
    } catch (FileNotFoundException | ParseException e) {
      e.printStackTrace();
    }
    
    //prints the arraylist with toString format
    for (Person str : person) {
      System.out.println(str.toString()); //person.get(i).toString()
    }
    System.out.println();
    
  //Mapping NID to Passports:
    //Creating Arraylist of Passport Numbers
    ArrayList<String> passport = new ArrayList<>();
    for (Person str : person) {
      passport.add(str.getPassportNumber()); //person.get(i).getPassportNumber()
    }
  
    Map<String, ArrayList<String>> map = new TreeMap<>();
    for (int i=0; i<person.size(); i++) {
      map.computeIfAbsent(person.get(i).getNID(), k -> new ArrayList<>()).add(passport.get(i));
    }
    /**Code Explanation:
     * Firstly I opted to use TreeMap because it is able to sort the keys in ascending order without
     * any further code implementation that would have been needed in HashMap.
     * From What I have read online, computeIfAbsent is a shortcut method that can be used for
     * assigning a list as the value of a key.
     * The Syntax I've Found was:
     * public V
     *        computeIfAbsent(K key,
     *              Function<? super K, ? extends V> remappingFunction)
     * Example I followed:
     * ArrayList<String> list = map.computeIfAbsent(KEY, k -> new ArrayList<>());
     *       list.add(VALUE));
     *To my Understanding,
     * computeIfAbsent executes only when the Key == null, i.e no value assigned.
     * when it executes, a value is computed and assigned to the key according to the given function.
     * In this case my function was k -> new ArrayList<>()
     * This lambda expression, creates a new arraylist and assigns it to the key.
     * using .add i am able to store passport numbers in it.
     * Thus, the keys(NID) are mapped to a list containing PassportNumbers.
     */
     
    //displays the Mapping result
    for (String i : map.keySet()) {
      System.out.println("NID (key): " + i + " | PassportNo. (value): " + map.get(i));
    }
  }
}
