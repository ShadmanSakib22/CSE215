package com.shadmansakib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentFileIO_2014310 {
  
  public static void main(String[] args) {
  
    Student_2014310[] temp = SetData(); //gets address of students array
  
    double[] marks = new double[15]; //will store total mark obtained by each student
  
    //displays Name, ID, TotalMarks.
    for (int i =0; i<15; i++){
      double Total = temp[i].getAttendanceMarks() +
                       temp[i].getQuiz1() + temp[i].getQuiz2() + temp[i].getQuiz3() +
                       temp[i].getMidTerm() + temp[i].getFinalTerm() + temp[i].getProject();
      marks[i] = Total;
      
      //displaying:
      System.out.printf("Name: %s %s\n", temp[i].getFirst_name(), temp[i].getLast_name());
      System.out.printf("ID: %s\n", temp[i].getId());
      System.out.printf("Total Marks Obtained: %.1f\n", marks[i]);
      System.out.println();
    }
  
    int max = 0; int max2 = 0;
    for ( int i = 1; i < marks.length; i++ ) {
      if (marks[i] > marks[max]) {
        max2 = max;
        max = i; //index of the maximum mark
      }
      else if(marks[i] > marks[max2]) {
        max2 = i; //index of 2nd maximum mark
      }
    }
    int min = 0;
    for ( int i = 1; i < marks.length; i++ ) {
      if (marks[i] < marks[min]) {
        min = i; //index of the minimum mark
      }
    }
  
    System.out.println();
    
    System.out.println("Student Who got Highest Mark: ");
    System.out.printf("Name: %s %s\n", temp[max].getFirst_name(), temp[max].getLast_name());
    System.out.printf("ID: %s\n\n", temp[max].getId());
  
    System.out.println("Student Who got Lowest Mark: ");
    System.out.printf("Name: %s %s\n", temp[min].getFirst_name(), temp[min].getLast_name());
    System.out.printf("ID: %s\n", temp[min].getId());
    
    //array of 3 students who got max, max2, and min marks respectively
    Student_2014310[] theThree = new Student_2014310[3];
    theThree[0] = temp[max];
    theThree[1] = temp[max2];
    theThree[2] = temp[min];
    
    String filename = "the_three.txt";
    CreateFile(theThree, filename); //creates txt file of the 3 using toString format
  }
  
  public static Student_2014310[] SetData(){
    
    //String path needs to be changed...\\student_data_2014310.txt
    String path = "C:\\Users\\Toast\\IdeaProjects\\File IO Assignment\\student_data.txt";
  
    Student_2014310[] students = new Student_2014310[15]; //15 since there are 15 students in the txt file
    try (
      Scanner input = new Scanner(new File(path))
    ){
      while(input.hasNext()){
        for (int i = 0; i < 15; i++) {
          students[i] = new Student_2014310();
          students[i].setFirst_name(input.next());
          students[i].setLast_name(input.next());
          students[i].setId(input.next());
          students[i].setCgpa(input.nextDouble());
          students[i].setAttendanceMarks(input.nextDouble());
          students[i].setQuiz1(input.nextDouble());
          students[i].setQuiz2(input.nextDouble());
          students[i].setQuiz3(input.nextDouble());
          students[i].setMidTerm(input.nextDouble());
          students[i].setFinalTerm(input.nextDouble());
          students[i].setProject(input.nextDouble());
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
    return students;
  }
  
  public static void CreateFile(Student_2014310[] students, String filename){
    
    
    File file = new File(filename);
    try {
      PrintWriter pw = new PrintWriter(file);
      pw.print(students[0]); //data of student with highest mark
      pw.print(students[1]); //data of student with 2nd highest mark
      pw.print(students[2]); //data of student with lowest mark
      
      pw.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  
    System.out.printf("\n%s has been created",filename);
  }
}
