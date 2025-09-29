package org.example;

public class Rectangle extends Shape{
  //variables
  private double length;
  private double width;

  //rectangle defult constructor
  public Rectangle(){
    length = 0;
    width = 0;
  }
  
  //rectangle constructor
  public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }

  //getters
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }

  //override for getArea
  public double getArea(){
    return length * width;
  }
  //override for getPerimeter
  public double getPerimeter(){
    return (2 * length) + (2 * width); // 2l + 2w
  }
}