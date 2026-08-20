// package com.smCoding.geometry.Circle;

public class Calculator {
  public static void main(String[] args) {
    // get user input for rectangle dimensions
    double length = 5.0;
    double width = 3.0;
    Rectangle rectangle = new Rectangle(length, width);
    System.out.println("Area: " + rectangle.calculateArea());
    System.out.println("Perimeter: " + rectangle.calculatePerimeter());

    // get user input for circle radius
    double radius = 2.0;
    Circle circle = new Circle(radius);
    System.out.println("Area: " + circle.calculateArea());
    System.out.println("Circumference: " + circle.calculateCircumference());

  }
}
