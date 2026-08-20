
// import java.util.Random;
import java.util.Scanner;

public class challenges {

  int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // 69. Create a program using recursion to check if a string is a palindrome using recursion.
  boolean isPalindrome(String str, int start, int end) {
    if (start >= end) {
      return true;
    }
    if (str.charAt(start) != str.charAt(end)) {
      return false;
    }
    return isPalindrome(str, start + 1, end - 1);
  }

  /*
   * int first = 0;
   * int second = 1;
   * int fibonacci(int n) {
   * if (n <= 1) {
   * return n;
   * }
   * int result = first + second;
   * first = second;
   * second = result;
   * return result;
   * }
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Random random = new Random();
    // 59. Create a program using do-while to find password checker until a valid
    // password is entered.
    // String validPassword = "sayed123";
    // String userPassword;
    // do {
    // System.out.println("Enter a password to Enter our event");
    // userPassword = sc.next();
    // if (validPassword.equals(userPassword)) {
    // System.out.println("Welcome");
    // } else {
    // System.out.println("sorry incorrect password.");
    // }
    // } while (!validPassword.equals(userPassword));

    // 60. Create a program using do-while to implement a number guessing game.
    // System.out.println("Welcome to our Guessing Game");
    // int randomNum = random.nextInt(10) + 1;
    // // int randomNum = 1;
    // int userInput;
    // int attempt = 0;
    // do {
    // System.out.println("guess a number between 1-10:");
    // userInput = sc.nextInt();
    // if (userInput == randomNum) {
    // System.out.println("You win!");
    // System.out.println("You guessed the number in " + attempt + " attempts.");
    // // break;
    // } else {
    // System.out.println("wrong guess try again");
    // }
    // // } while (true);
    // } while (userInput != randomNum);
    // // } while (userInput == randomNum);

    // 61. Create a program using for loop multiplication table for a number.
    // int maxCount = 10;
    // int userInput = 3;
    // for(int i = 1; i <= maxCount; i++){
    // System.out.println(userInput + " X " + i + " = " + userInput * i);
    // }

    // 62. Create a program using for to display if a number is prime or not.
    // int userInput = 11;
    // boolean isprime = true;
    // for (int i = 2; i < userInput; i++) {
    // if (userInput % i != 0) {
    // isprime = true;
    // } else if (userInput == 0) {
    // isprime = false;
    // break;
    // } else {
    // isprime = false;
    // break;
    // }
    // }
    // if (isprime) {
    // System.out.println("prime number");
    // } else {
    // System.out.println("not prime number");
    // }

    // 63. Create a program using for-each to find the maximum value in an integer
    // array.
    // int[] arr = new int[] { 4, 2, 3, 7, 6, 9, 8, 12, 1};
    // int min = arr[0];
    // int max = arr[0];
    // for (int num : arr){
    // if (num > max ) {
    // max = num;
    // } else if (num < min) {
    // min = num;
    // }
    // System.out.println(num);
    // }
    // System.out.println("min number is: " + min + " and max number is: " + max);

    // 64. Create a program using for-each to the occurrences of a specific element
    // in an array.
    // int[] arr = new int[] { 3, 2, 3, 2, 6, 2, 8, 12, 3};
    // int occ = 6;
    // int count = 0;
    // for (int num : arr){
    // if (num == occ) {
    // count++;
    // } else {
    // continue;
    // }
    // }
    // System.out.println(occ + " number occurrences is: " + count);

    // 65. Create a program using break to read inputs from the user in a loop and
    // break the loop if a specific keyword (like "exit") is entered.
    // String userInput;
    // while (true) {
    // userInput = sc.next();
    // if (userInput.equals("exit")) {
    // break;
    // }
    // }

    // 66. Create a program using continue to sum all positive numbers entered by
    // the user skip any negative numbers.
    // int userInput;
    // int result = 0;
    // while (true) {
    // System.out.println("enter a number to sum -1 for exit");
    // userInput = sc.nextInt();
    // if (userInput == -1) {
    // break;
    // }else if (userInput % 2 == 1){
    // continue;
    // }else {
    // result += userInput;
    // }
    // }
    // System.out.println("the result is: " + result);

    // 67. Create a program using continue to print only even numbers using continue
    // for odd numbers.
    // int num = 100;
    // int result = 0;
    // for(int i = 1; i <= num; i++){
    // if (i % 2 == 1) {
    // continue;
    // }
    // System.out.println("even number: " + i);
    // result += i;
    // }
    // System.out.println("even number result in sum: " + result);

    // 68. Create a program using recursion to display the Fibonacci series upto a
    // certain number.
    // int userInput;
    // challenges obj = new challenges();
    // System.out.println("Enter a number to display fibonacci series");
    // userInput = sc.nextInt();
    // for (int i = 0; i < userInput; i++) {
    //   System.out.print(obj.fibonacci(i) + " ");
    // }

    // 69. Create a program using recursion to check if a string is a palindrome using recursion.
    // String userInput;
    // int start = 0;
    // int end;
    // challenges obj = new challenges();
    // System.out.println("Enter a string to check if it is palindrome or not");
    // userInput = sc.next();
    // end = userInput.length() - 1;
    // boolean isPalindrome = obj.isPalindrome(userInput, start, end);
    // if (isPalindrome) {
    //   System.out.println(userInput + " is a palindrome");
    // } else {
    //   System.out.println(userInput + " is not a palindrome");
    // }


    sc.close();

  }
}
// int difference = Math.abs(userInput - randomNum);
// System.out.println("difference: " + difference);