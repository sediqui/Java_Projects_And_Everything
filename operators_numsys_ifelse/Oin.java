import java.util.Scanner;

public class Oin {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    // swapin two numbers
    // int a = 5;
    // int b = 10;
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("a: " + a);
    // System.out.println("b: " + b);

    // Calculator
    // float num1, num2;
    // double result;
    // char operator;
    // System.out.println("Enter first number: ");
    // num1 = in.nextFloat();
    // System.out.println("Enter operator (+, -, *, /): ");
    // operator = in.next().charAt(0);
    // System.out.println("Enter second number: ");
    // num2 = in.nextFloat();
    // if (operator == '+') {
    //   result = num1 + num2;
    //   System.out.println("Result: " + result);
    // }else if (operator == '-') {
    //   result = num1 - num2;
    //   System.out.println("Result: " + result);      
    // }else if (operator == '*') {
    //   result = num1 * num2;
    //   System.out.println("Result: " + result);      
    // }else if (operator == '/') {
    //   if (num2 != 0) {
    //     result = num1 / num2;
    //     System.out.println("Result: " + result);
    //   } else {
    //     System.out.println("Error: Division by zero is not allowed.");
    //   }
    // }
  
    // arthmetic operations
    // float num1, num2;
    // double result;
    // char operator;
    // System.out.println("Enter first number: ");
    // num1 = in.nextFloat();
    // System.out.println("Enter second number: ");
    // num2 = in.nextFloat();
    // System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
    // System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
    // System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
    // System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
  
    // order of operations
    // float num1 = 2, num2 = 3, num3 = 4, num4 = 5;
    // double result;
    // result = num1 + num2 * num3; // 2 + 3 * 4 = 2 + 12 = 14
    // System.out.println("Result: " + result);
    // // 2 + 3 * 4 / 5 = 2 + 12 / 5 = 2 + 2.4 = 4.4
    // result = num1 + num2 * num3 / num4;
    // System.out.println("Result: " + result);
    
    // shorthand operators
    // int a = 5;
    // a += 10;
    // a *= 2;
    // a -= 10;
    // a /= 5;
    // a %= 3;
    // System.out.println("a: " + a);

    // uanary operators
    // int a = 5;
    // a++;
    // ++a;
    // a--;
    // --a;
    // a++;
    // System.out.println("a: " + a);

    // perimeter of a rectangle
    // System.out.println("Enter a Length: ");
    // double Length = in.nextDouble();
    // System.out.println("Enter a Width: ");
    // double Width = in.nextDouble();
    // System.out.println("Enter c number: ");
    // double Perimeter = 2 * (Length + Width);
    // System.out.println("Perimeter of the rectangle is: " + Perimeter); 

    // Area of triangle
    // System.out.println("Enter a Base: ");
    // double Base = in.nextDouble();
    // System.out.println("Enter a Height: ");
    // double Height = in.nextDouble();
    // double Area = 0.5 * Base * Height;
    // System.out.println("Area of the triangle is: " + Area); 

    // simple interest
    // System.out.println("Enter a Principal: ");
    // double Principal = in.nextDouble();
    // System.out.println("Enter a Rate: ");
    // double Rate = in.nextDouble();
    // System.out.println("Enter a Time: ");
    // double Time = in.nextDouble();
    // double SimpleInterest = (Principal * Rate * Time) / 100;
    // System.out.println("Simple Interest is: " + SimpleInterest);

    // compund interest
    // System.out.println("Enter a Principal: ");
    // double Principal = in.nextDouble();
    // System.out.println("Enter a Rate: ");
    // double Rate = in.nextDouble();
    // System.out.println("Enter a Time: ");
    // double Time = in.nextDouble();
    // System.out.println("Enter a Number of times interest is compounded per year: ");
    // double n = in.nextDouble();
    // double CompoundInterest = Principal * Math.pow((1 + Rate / (n * 100)), n * Time);
    // // double CompoundInterest = Principal * (1 + Rate/100) * Time;
    // System.out.println("Compound Interest is: " + CompoundInterest);

    // fahrenheit to celsius
    // System.out.println("Enter fahrenheit to convert to celsius: ");
    // double fahrenheit = in.nextDouble();
    // double celsius = (fahrenheit - 32) * 5/9;
    // System.out.println("Celsius: " + celsius);

    // calculate product of two floating numbers
    // float num3 = 3, num4 = 4;
    // System.out.println("Enter first number: ");
    // float num1 = in.nextFloat();
    // System.out.println("Enter second number: ");
    // float num2 = in.nextFloat();
    // float product = num1 * num2;
    // System.out.println("product of two floating numbers: " + product);
    // System.out.println("product: " + num3 + num4);
    // System.out.println("product: " + 3 + 4);

    // if else statement
    // boolean isMale;
    // System.out.println("Are you male or female? (true for male, false for female): ");
    // isMale = in.nextBoolean();
    // if (isMale) {
    //   System.out.println("You are male.");
    // } else {
    //   System.out.println("You are female.");
    // }
    // (isMale)?System.out.println("You are male."): System.out.println("You are female."); not working sorry

    // logical operators and relational operators
    // int age;
    // System.out.println("Enter your age: ");
    // age = in.nextInt();
    // if (age >= 18 && age <= 34) {
    //   System.out.println("You are an adult.");
    // } else if (age >= 35 && age <= 50) {
    //   System.out.println("You are middle-aged.");
    // } else if (age != 0 && age < 18) {
    //   System.out.println("You are a child.");
    // } else if (age == 51 || age > 51) {
    //   System.out.println("You are a senior citizen.");
    // } else {
    //   System.out.println("Invalid age entered.");
    // }

    // not a switch statement i am doing chalanges sorry for that
    // Create a program that determines if a number is positive, negative, or zero.
    // int number;
    // System.out.println("Enter a number: ");
    // number = in.nextInt();
    // if (number > 0) {
    //   System.out.println("The number is positive.");
    // } else if (number < 0) {
    //   System.out.println("The number is negative.");
    // } else {
    //   System.out.println("The number is zero.");
    // }
    // Create a program that determines if a number is odd or even.
    // int number;
    // System.out.println("Enter a number: ");
    // number = in.nextInt();
    // if (number % 2 == 0) {
    //   System.out.println("The number is even.");
    // } else {
    //   System.out.println("The number is odd.");
    // }
    // Create a program that determines the greatest of the three numbers.
    // int num1, num2, num3;
    // System.out.println("Enter first number: ");
    // num1 = in.nextInt();
    // System.out.println("Enter second number: ");
    // num2 = in.nextInt();
    // System.out.println("Enter third number: ");
    // num3 = in.nextInt();
    // if (num1 >= num2 && num1 >= num3) {
    //   System.out.println("The greatest number is: " + num1);
    // } else if (num2 >= num1 && num2 >= num3) {
    //   System.out.println("The greatest number is: " + num2);
    // } else {
    //   System.out.println("The greatest number is: " + num3);
    // }
    // Create a program that determines if a given year is a leap year.
    // int year;
    // System.out.println("Enter a year: ");
    // year = in.nextInt();
    // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    //   System.out.println("The year is a leap year.");
    // } else {
    //   System.out.println("The year is not a leap year.");
    // }
    // Create a program that calculates grades based on marks.
    // A -> 90-100
    // B -> 80-89
    // C -> 70-79
    // D -> 60-69
    // F -> 0-59
    // int marks;
    // System.out.println("Enter your marks: ");
    // marks = in.nextInt();
    // if (marks >= 90 && marks <= 100) {
    //   System.out.println("Grade: A");
    // } else if (marks >= 80 && marks < 90) {
    //   System.out.println("Grade: B");
    // } else if (marks >= 70 && marks < 80) {
    //   System.out.println("Grade: C");
    // } else if (marks >= 60 && marks < 70) {
    //   System.out.println("Grade: D");
    // } else if (marks >= 0 && marks < 60) {
    //   System.out.println("Grade: F");
    // } else {
    //   System.out.println("Invalid marks entered.");
    // }
    // Create a program that categorizes a person's age group (child, teenager, adult, senior).
    // int age;
    // System.out.println("Enter your age: ");
    // age = in.nextInt();
    // if (age >= 0 && age < 13) {
    //   System.out.println("You are a child.");
    // } else if (age >= 13 && age < 20) {
    //   System.out.println("You are a teenager.");
    // } else if (age >= 20 && age < 60) {
    //   System.out.println("You are an adult.");
    // } else if (age >= 60) {
    //   System.out.println("You are a senior.");
    // } else {
    //   System.out.println("Invalid age entered.");
    // }

    // ternary operator
    // int age;
    // System.out.println("Enter your age: ");
    // age = in.nextInt();
    // String ageGroup = (age >= 0 && age < 13) ? "child" :
    //                   (age >= 13 && age < 20) ? "teenager" :
    //                   (age >= 20 && age < 60) ? "adult" : "senior";
    // System.out.println("You are a " + ageGroup + ".");

    // shift operator
    // int a = 16;
    // int b = a >> 2; // Right shift by 2 positions
    // int c = a << 2; // Left shift by 2 positions
    // System.out.println("a: " + a);
    // System.out.println("Right shift (a >> 2): " + b);
    // System.out.println("Left shift (a << 2): " + c);

    // bitwise operators
    int a = 2;  // In binary: 0010
    int b = 1;  // In binary: 0001
    int andResult = a & b; // Bitwise AND
    int orResult = a | b;  // Bitwise OR
    int xorResult = a ^ b; // Bitwise XOR
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("Bitwise AND (a & b): " + andResult);
    System.out.println("Bitwise OR (a | b): " + orResult);
    System.out.println("Bitwise XOR (a ^ b): " + xorResult);
    int notResult = ~a; // Bitwise NOT
    System.out.println("Bitwise NOT (~a): " + notResult);


  }
}