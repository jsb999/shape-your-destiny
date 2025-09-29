package org.example;

public class Circle extends Shape {
  //variables
  private double radius;
  
  //circle defult constructor
  public Circle(){
    radius = 0;
  }

  //circle constructor
  public Circle(double radius){
    this.radius = radius;
  }

  //getter for radius
  public double getRadius(){
    return radius;
  }
  
  //override for getArea
  @Override
  public double getArea(){
    return Math.PI * (radius * radius); // PIr^2
  }
  //override for getPerimeter
  @Override
  public double getPerimeter(){
    return 2 * Math.PI * radius; // 2PIr;
  }
}