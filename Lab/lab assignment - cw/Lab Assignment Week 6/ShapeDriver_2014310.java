package com.shadmansakib;

import java.util.Scanner;

public class ShapeDriver_2014310 {
  
  public static void main(String[] args) {
    
    String color;
    boolean filled;
    double length;
    double width;
    double sideLength;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("-- Taking information for 'Shape' --");
    System.out.print("Enter color - ");
    color = input.nextLine();
    System.out.print("Is filled. T/F? - ");
    filled = input.nextBoolean();
    System.out.println();
    Shape_2014310 Shape = new Shape_2014310 (filled, color);
    
  
    System.out.println("-- Taking information for 'Rectangle' --");
    input.nextLine(); //clearing buffer
    System.out.print("Enter color - ");
    color = input.nextLine();
    System.out.print("Is filled. T/F? - ");
    filled = input.nextBoolean();
    System.out.print("Enter Rectangle Length - ");
    length = input.nextDouble();
    System.out.print("Enter Rectangle Width - ");
    width = input.nextDouble();
    System.out.println();
    Rectangle_2014310 Rectangle = new Rectangle_2014310 (filled, color, length, width);
    
  
    System.out.println("-- Taking information for 'Square' --");
    input.nextLine(); //clearing buffer
    System.out.print("Enter color - ");
    color = input.nextLine();
    System.out.print("Is filled. T/F? - ");
    filled = input.nextBoolean();
    input.nextLine();
    System.out.print("Enter Square Length - ");
    sideLength = input.nextDouble();
    System.out.println();
    Square_2014310 Square = new Square_2014310 (filled, color, sideLength);
    
  
    //printing toStrings
    System.out.println();
    System.out.println(Shape.toString());
    System.out.println(Rectangle.toString());
    System.out.println(Square.toString());
  
    //printing area and perimeter
    System.out.printf("Area of the square with side length of %.1f is: %.2f\n",
      sideLength, Square.getArea());
    System.out.printf("Area of the rectangle with side lengths of %.1f and %.2f is: %.2f\n",
      length, length, Rectangle.getArea());
    System.out.printf("Perimeter of the square with side length of %.1f is: %.2f\n",
      sideLength, Square.getPerimeter());
    System.out.printf("Perimeter of the rectangle with side lengths of %.1f and %.2f is: %.2f\n",
      length, length, Rectangle.getPerimeter());
  }
}
