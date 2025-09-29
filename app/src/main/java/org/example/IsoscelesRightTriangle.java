package org.example;

public class IsoscelesRightTriangle extends RightTriangle{
  //variables
  private double leg;

  //defult constructor
  public IsoscelesRightTriangle(){
    super();
    this.leg = 0;
  }
  //constructor
  public IsoscelesRightTriangle(double leg){
    super(leg, leg);
    this.leg = leg;
  }
  //getter
  public double getLeg(){
    return leg;
  }
}