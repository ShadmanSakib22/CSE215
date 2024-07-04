//Name: Shadman Sakib - ID: 2014310642 - CSE 215L.12
//Code for 2D array, inputs from user, return sum of row as 1D array.

package com.shadmansakib;
import java.util.Arrays;        //if i want to use the code between line 25-31
import java.util.Scanner;

public class LabAssignment3_2014310 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
  
    System.out.println("Employee 0-7 work hours on Su-M-T-W-Th-F-Sa\n");
    
    //8x7 array for work hours
    int [][] arr2Dwork = new int[8][7];
    //i = rows , j = columns
    for (int i =0; i<8; i++) {
      System.out.printf("Enter Employee %d Work hour on each day with space between: ", i);
      for (int j=0; j<7; j++){
        arr2Dwork [i][j] = input.nextInt();
      }
    }
    
    /*
    //displays arr entered
    System.out.println("\nDisplaying input...");
    for (int [] i : arr2Dwork){
      System.out.println(Arrays.toString(i));
    }
    */
  
    //call the method with the sum of elements in each row
    int [] sum = sum(arr2Dwork);
    
    //display employee work hours
    System.out.println(" ");
    for (int i =0; i<8; i++) {
      System.out.printf("Employee %d: %s hours\n", i, sum[i]);
    }
    
  }
  
  public static int[] sum(int [][] arr2Dwork) {
    int ans0 = 0;
    int ans1 = 0;
    int ans2 = 0;
    int ans3 = 0;
    int ans4 = 0;
    int ans5 = 0;
    int ans6 = 0;
    int ans7 = 0;
  
    for (int j = 0; j < 7; j++) {
      ans0 += arr2Dwork[0][j];
    }
    for (int j = 0; j < 7; j++) {
      ans1 += arr2Dwork[1][j];
    }
    for (int j = 0; j < 7; j++) {
      ans2 += arr2Dwork[2][j];
    }
    for (int j = 0; j < 7; j++) {
      ans3 += arr2Dwork[3][j];
    }
    for (int j = 0; j < 7; j++) {
      ans4 += arr2Dwork[4][j];
    }
    for (int j = 0; j < 7; j++) {
      ans5 += arr2Dwork[5][j];
    }
    for (int j = 0; j < 7; j++) {
      ans6 += arr2Dwork[6][j];
    }
    for (int j = 0; j < 7; j++) {
      ans7 += arr2Dwork[7][j];
    }
    
    int [] arrAns = {ans0,ans1,ans2,ans3,ans4,ans5,ans6,ans7};  //not sure how to fix this redundant issue.
    
    return arrAns;
  }
}
