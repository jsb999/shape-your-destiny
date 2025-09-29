package org.example;

public class RightTriangle extends Shape implements Polygon{
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
  @Override
  public double getArea(){
    return (base * height) / 2; // (bh)/2
  }

  //override for getPerimeter
  @Override
  public double getPerimeter(){
    return base + height + Math.sqrt((base * base) + (height * height)); // b + h + sqrt(b^2 + h^2)
    //pythagorean theorem
  }

  //override for polygon interface
  @Override
  public int numberOfSides(){
    return 3;
  }
}