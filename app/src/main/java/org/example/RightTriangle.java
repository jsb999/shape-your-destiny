package org.example;

public class RightTriangle extends Shape{
  //variables
  private double base;
  private double height;

  //rightTriangle defult constructor
  public RightTriangle(){
    base = 0;
    height = 0;
  }

  //rightTriangle constructor
  public RightTriangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  //getters
  public double getBase(){
    return base;
  }
  public double getHeight(){
    return height;
  }

  //override for getArea
  public double getArea(){
    return (base * height) / 2; // (bh)/2
  }

  //override for getPerimeter
  public double getPerimeter(){
    return base + height + Math.sqrt((base * base) + (height * height)); // b + h + sqrt(b^2 + h^2)
    //pythagorean theorem
  }
}