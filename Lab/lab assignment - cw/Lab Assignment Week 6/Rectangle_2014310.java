package com.shadmansakib;

import java.util.Formatter;

public class Rectangle_2014310 extends Shape_2014310 {
  
  protected double length;
  protected double width;
  
  public Rectangle_2014310(boolean filled, String color, double length, double width) {
    super(filled, color);
    this.length = length;
    this.width = width;
  }
  
  
  public String toString() {
    String shape = super.toString();
    
    Formatter rectangle = new Formatter(new StringBuilder());
    rectangle.format("%s",shape);
    rectangle.format("%s %.1f\n", "Length:", this.length);
    rectangle.format("%s %.2f\n", "Width:", this.width);
  
    return rectangle.toString();
  }
  
  public double getArea() {
    return length * width;
  }
  
  public double getPerimeter() {
    return 2*(length + width);
  }
}
