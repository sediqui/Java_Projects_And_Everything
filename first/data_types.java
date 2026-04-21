import java.util.Scanner;

public class data_types {
  public static void main(String[] args) {
    // boolean isValid = false;
    // float myfloat = 5.34f;
    // double mydouble = 6.78;
    // String wishies = "Good morning";
    // char operator = '+';
    // System.out.println(isValid + "\n" + myfloat + "\n" + mydouble + "\n" +
    // wishies + "\n" + operator);
    // System.out.println("*\n* *\n* * *\n* * * *\n* * * * *\n");
    // System.out.println("* * * * *\n* * * *\n* * *\n* *\n*\n");
    // System.out.println(" *\n * *\n * * *\n * * * *\n* * * * *\n");
    // System.out.println("* * * * *\n * * * *\n * * *\n * *\n *\n");

    Scanner input = new Scanner(System.in); 

    // System.out.print("Enter an integer: ");
    // int myInt = input.nextInt();
    // System.out.print("Enter a double: ");
    // double myDouble = input.nextDouble();
    // System.out.print("Enter a character: ");
    // char myChar = input.next().charAt(0);
    // System.out.print("Enter a boolean (true/false): ");
    // boolean myBoolean = input.nextBoolean();
    // System.out.print("Enter a string: ");
    // String myString = input.next();
    // Output the values
    // System.out.println("Integer: " + myInt);
    // System.out.println("Double: " + myDouble);
    // System.out.println("Character: " + myChar);
    // System.out.println("Boolean: " + myBoolean);
    // System.out.println("String: " + myString);
    // System.out.println("Data types in Java:");
    // System.out.println("- Primitive: int, double, char, boolean");
    // System.out.println("- Non-primitive: String, arrays, classes");
  
    
    // System.out.print("Enter First number to sum: ");
    // int first = input.nextInt();
    // System.out.print("Enter Second number to sum: ");
    // int second = input.nextInt();
    // int sum = first + second;
    // System.out.println("The sum of " + first + " and " + second + " is: " + sum);
    // // Clear the input buffer
    // input.nextLine();
    // // Prompt the user for their name and read it as a string
    // System.out.print("Enter your name: ");
    // String name = input.nextLine();
    // System.out.println("Welcome, " + name + " to Java programming!");
  
    System.out.println("Enter first number");
    int n = input.nextInt();
    System.out.println("Now, Enter second number");
    int n1 = input.nextInt();
    System.out.println("The sum of " + n + " + " + n1 + " = " + (n + n1));

  }
}