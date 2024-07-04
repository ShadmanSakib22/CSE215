package com.shadmansakib;

import java.util.Formatter;

public class Shape_2014310 {
  
  protected boolean filled;
  protected String color;
  
  public Shape_2014310(boolean filled, String color){
  
    this.filled = filled;
    this.color = color;
  }
  
  
  public String toString() {
    Formatter shape = new Formatter(new StringBuilder());
    
    shape.format("%s %s\n", "Color:", this.color);
    shape.format("%s %s\n", "Is Filled:", this.filled);
  
    return shape.toString();
  }
}

