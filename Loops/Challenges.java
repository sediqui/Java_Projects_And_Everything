import java.util.Scanner;

public class Challenges {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // Develop a program that prints the multiplication table for a given number.
    // System.out.print("Enter a number for mutiplication: ");
    // int num = in.nextInt();
    // int result = 0;
    // for(int i = 1; i <= 10; i++) {
    // // result = num * i;
    // // System.out.println(num + " x " + i + " = " + result);
    // System.out.println(num + " x " + i + " = " + (num * i));
    // }

    // Create a program to sum all odd numbers from 1 to a specified number N.
    // System.out.print("Enter a number: ");
    // int num = in.nextInt();
    // int result = 0;
    // int resultEven = 0;
    // for(int i = 1; i <= num; i++){
    // if(i % 2 == 1){
    // result += i;
    // }else{
    // resultEven += i;
    // }
    // }
    // System.out.println("Sum of all odd number: " + result);
    // System.out.println("Sum of all even number: " + resultEven);
    // System.out.println("Sum of all odd number: " + (float)(1 % 2));

    // Write a function that calculates the factorial of a given number.
    // System.out.print("Enter a number: ");
    // int num = in.nextInt();
    // int result = 0;
    // result += factorial(num);
    // System.out.println("factoial of " + num + " is: " + result);

    // Create a program that computes the sum of the digits of an integer.
    // System.out.print("Enter a number: ");
    // int num = in.nextInt();
    // int result = 0;
    // int i = 1;
    // while(i <= num){
    // result += num % 10;
    // num /= 10;
    // }
    // System.err.println("Sum of the digits: " + result);

    // Create a program to find the least common multiple (LCM) of two numbers.
    // System.out.print("Enter first number: ");
    // int num1 = in.nextInt();
    // System.out.print("Enter second number: ");
    // int num2 = in.nextInt();
    // int lcm = (num1 > num2) ? num1 : num2;
    // while(true){
    // if(lcm % num1 == 0 && lcm % num2 == 0){
    // System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    // break;
    // }
    // lcm++;
    // }

    // Create a program to find the GCD (Greatest Common Divisor) of two numbers.
    // System.out.print("Enter first number: ");
    // int num1 = in.nextInt();
    // System.out.print("Enter second number: ");
    // int num2 = in.nextInt();
    // int gcd = 1;
    // for(int i = 1; i <= num1 && i <= num2; i++){
    // if(num1 % i == 0 && num2 % i == 0){
    // gcd = i;
    // }
    // }
    // System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

    // Create a program to check whether a given number is prime
    // System.out.print("Enter first number: ");
    // int num1 = in.nextInt();
    // boolean isPrime = true;
    // if (num1 <= 1) {
    // isPrime = false;
    // } else if (num1 == 2) {
    // isPrime = true;
    // } else if (num1 % 2 == 0) {
    // isPrime = false;
    // } else {
    // for (int i = 3; i <= num1; i++) {
    // if (num1 % i == 0 && i != num1 ) {
    // isPrime = false;
    // break;
    // } else {
    // isPrime = true;
    // }
    // }
    // }
    // if (isPrime) {
    // System.out.println(num1 + " is prime number.");
    // } else {
    // System.out.println(num1 + " is not prime number.");
    // }
    // of ai prime number
    // System.out.print("Enter first number: ");
    // int num1 = in.nextInt();
    // boolean isPrime = true;
    // if (num1 <= 1) {
    // isPrime = false;
    // } else {
    // for (int i = 2; i <= Math.sqrt(num1); i++) {
    // if (num1 % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // if (isPrime) {
    // System.out.println(num1 + " is a prime number.");
    // } else {
    // System.out.println(num1 + " is not a prime number.");
    // }
    // }
    // System.out.println("sqrt of " + num1 + " is: " + Math.sqrt(num1));

    // public static int factorial (int n) {
    // using recursion of function
    // if (n <= 1){
    // return 1;
    // }
    // return n * factorial(n - 1);
    // using Loop
    // int result = 1;
    // for (int i = 1; i <= n; i++) {
    // result *= i;
    // }
    // return result;
    // }

    // Create a program to reverse the digits of a number.
    // the easy one.
    // System.out.println("Enter a number: ");
    // int num = in.nextInt();
    // int result = 0;
    // for (int i = 0; i < num; i+=0) {
    // result = num % 10;
    // System.out.print(result);
    // num /= 10;
    // }
    // now the hard one.
    // System.out.println("Enter a number: ");
    // int num = in.nextInt();
    // int digits = 0;
    // int result = 0;
    // while (num != 0) {
    //   int powCount = 1;
    //   digits = num % 10;
    //   result = (result + digits) * (int) Math.pow(10, powCount);
    //   reversed = reversed * 10 + num % 10;
    //   num /= 10;
    //   powCount++;
    // }
    // if (result % 10 == 0) {
    //   result /= 10; // Removes the last 0, making it 123
    // }
    // System.out.print(result);

    // Create a program to print the fibonacci series up to a certain number N. 
    // System.out.print("Enter the number of terms: ");
    // int n = in.nextInt();
    // int first = 0, second = 1;
    // System.out.print("Fibonacci Series: ");
    // for (int i = 1; i <= n; i++) {
    //     System.out.print(first + " ");
    //     int next = first + second;
    //     first = second;
    //     second = next;
    // }

    // Create a program to check if a number is an Armstrong number.
    // System.out.println("Enter a number: ");
    // int num = in.nextInt();
    // int original = num;
    // int sum = 0;
    // while (num != 0) {
    //     int digit = num % 10;
    //     sum += digit * digit * digit;
    //     num /= 10;
    // }
    // if (sum == original) {
    //     System.out.println(original + " is an Armstrong number.");
    // } else {
    //     System.out.println(original + " is not an Armstrong number.");
    // }

    // Create a program to verify if a number is a palindrome.
    // System.out.println("Enter a number: ");
    // int num = in.nextInt();
    // int original = num;
    // int reversed = 0;
    // while (num != 0) {
    //     reversed = reversed * 10 + num % 10;
    //     num /= 10;
    // }
    // System.out.println("Reversed number: " + reversed);
    // if (reversed == original) {
    //     System.out.println(original + " is a palindrome.");
    // } else {
    //     System.out.println(original + " is not a palindrome.");
    // }

    // Create a program that prints a pattern of stars in the shape of a pyramid.
    // System.out.println("Enter the number of rows: ");
    // int rows = in.nextInt();
    int num = 5;
    for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= rows - i; j++) {
        //     System.out.print(" ");
        // }
        // for (int k = 1; k <= 2 * i - 1; k++) {
        //     System.out.print("*");
        // }
        for (int j = num; j - i > 0; j--) {
            System.out.print("  ");
        }
        for (int k = 0; k < i; k++) {
            System.out.print(" *");
        }
        System.out.println();
    }


    in.close();
  }

}
