package org.example;

public class Square extends Rectangle{
  //variables
  private double side;
  
  //defult constructor
  public Square(){
    super();
    this.side = 0;
  }
  //constructor
  public Square(double side){
    super(side, side);
    this.side = side;
  }

  //getter
  public double getSide(){
    return side;
  }
}