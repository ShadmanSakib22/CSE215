package com.shadmansakib;

import java.util.Arrays;
import java.util.Formatter;

public class Matrix_2014310 {
  
  //part - a
  private int numberOfRows;
  private int numberOfColumns;
  private double [][] matrix;
  
  //part - b
  public Matrix_2014310(int constant, int rows, int columns) {
    numberOfRows = rows;
    numberOfColumns = columns;
    
    //filling the array with the constant
    matrix = new double[numberOfRows][numberOfColumns];
    for (double[] row: matrix)
      Arrays.fill(row, constant);
  }
  
  public Matrix_2014310(double[][] matrix){
    this.matrix = matrix;
    numberOfRows = matrix.length;
    numberOfColumns = matrix[0].length;
  }
  
  
  //part - c
  public int getNumberOfRows() {
    return numberOfRows;
  }
  public int getNumberOfColumns() {
    return numberOfColumns;
  }
  public double[][] getMatrix() {
    return matrix;
  }
  public void setMatrix(double[][] NewMatrix) {
    matrix = NewMatrix;
  }
  
  //part - d
  public static Matrix_2014310 generateRandomMatrix(int rows, int columns){
    int constant = 1; //arbitrary value
    Matrix_2014310 obj = new Matrix_2014310(constant, rows, columns);
    for (int i =0; i<rows; i++){
      for (int j=0; j<columns; j++){
        obj.matrix[i][j] = (Math.random()*(42-7.5))+7.5;
      }
    }
    return obj;
  }
  public static Matrix_2014310 generateRandomMatrix(int rows, int columns, double lowerBound, double upperBound){
    Matrix_2014310 obj = generateRandomMatrix(rows,columns);
    for (int i =0; i<rows; i++){
      for (int j=0; j<columns; j++){
        obj.matrix[i][j] = (Math.random()*(upperBound-lowerBound))+lowerBound;
      }
    }
    return obj;
  }
  
  //part - e
  public Matrix_2014310 multiplyMatrixByConstant(int constant){
    Matrix_2014310 obj = new Matrix_2014310(getMatrix());
    for (int i=0; i<numberOfRows; i++) {
      for (int j=0; j<numberOfColumns; j++) {
        obj.matrix[i][j] = obj.matrix[i][j]*constant;
      }
    }
    return obj;
  }
  
  //part - f
  @Override
  public String toString() {
    Formatter formatter = new Formatter(new StringBuilder());
    for (int i = 0; i < numberOfRows; i++) {
      formatter.format("|");
      for (int j = 0; j < numberOfColumns; j++) {
        formatter.format("%-10.5f|", matrix[i][j]);
      }
      formatter.format("\n");
    }
    return formatter.toString();
  }
}
