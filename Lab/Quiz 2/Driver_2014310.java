package com.shadmansakib;

public class Driver_2014310 {
  
  public static void main(String[] args) {
    
    //creating matrix1
    int rows = 4; int cols=4; //input parameters with values of my choice:
    Matrix_2014310 matrix1 = Matrix_2014310.generateRandomMatrix(rows, cols);
    
    //creating matrix2
    //predefined matrix values [3,7,6.0,79.5]
    Matrix_2014310 matrix2 = Matrix_2014310.generateRandomMatrix(3,7,6.0,79.5);
    
    System.out.println("Result of calling generateRandomMatrix(int rows, int columns) with [4,4]: ");
    System.out.println(matrix1.toString());
  
    System.out.println("Result of calling generateRandomMatrix(int rows, int columns, " +
                         "double lowerBound, double upperBound) with [3,7,6.0,79.5]: ");
    System.out.println(matrix2.toString());
    
    //creating matrix 3
    rows = matrix1.getNumberOfRows();
    cols = matrix1.getNumberOfColumns();
    double[][] arr = new double[rows][cols];
    Matrix_2014310 matrix3 = new Matrix_2014310(arr);
    matrix3.setMatrix(matrix1.getMatrix());
    matrix3 = matrix3.multiplyMatrixByConstant(5); //value of my choice: 5
  
    //creating matrix 4
    rows = matrix2.getNumberOfRows();
    cols = matrix2.getNumberOfColumns();
    arr = new double[rows][cols];
    Matrix_2014310 matrix4 = new Matrix_2014310(arr);
    matrix4.setMatrix(matrix2.getMatrix());
    matrix4 = matrix4.multiplyMatrixByConstant(2); //value of my choice: 2
  
    System.out.println("Result of calling multiplyMatrixByConstant(int constant) with [5]: ");
    System.out.println(matrix3.toString());
    System.out.println("Result of calling multiplyMatrixByConstant(int constant) with [2]: ");
    System.out.println(matrix4.toString());
    
  }
}
