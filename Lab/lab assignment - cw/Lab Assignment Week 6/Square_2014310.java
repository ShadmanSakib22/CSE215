package com.shadmansakib;

import java.util.Formatter;

public class Square_2014310 extends Rectangle_2014310{
  
  public Square_2014310(boolean filled, String color, double sideLength) {
    super(filled, color, sideLength, sideLength);
    
  }
  
  
  public String toString() {
    
    Formatter square = new Formatter(new StringBuilder());
    square.format("%s %s\n", "Color:", this.color);
    square.format("%s %s\n", "Is Filled:", this.filled);
    square.format("%s %.1f\n", "Length of Side:", this.length);
  
    return square.toString();
  }
}
