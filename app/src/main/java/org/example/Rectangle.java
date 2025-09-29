package org.example;

public class Rectangle extends Shape implements Polygon{
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
  @Override
  public double getArea(){
    return length * width;
  }
  //override for getPerimeter
  @Override
  public double getPerimeter(){
    return (2 * length) + (2 * width); // 2l + 2w
  }

  //override for polygon interface
  @Override
  public int numberOfSides(){
    return 4;
  }
}