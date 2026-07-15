// public class Loop {
// public static void main (String[] args) {
// single line comments
/*
multi line comments 
*/

import java.util.Scanner;

/**
 * documentation comment
 */
// now working on loops
// using method
// Loop obj = new Loop();
// obj.
// greet();
// patternLeft();
// patternDownLeft();
// patternRigth();
// }
// public static void greet () {
// System.out.println("good morning");
// }
// public static void patternLeft () {
// for(int i = 1; i <= 5; i++) {
// for(int l = 0; l < i; l++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// public static void patternDownLeft () {
// for(int i = 0; i < 5; i++) {
// for(int l = 5; l > i; l--) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// public static void patternRigth () {
// for(int i = 1; i <= 5; i++) {
// for(int l = 5; l >= i; l--) {
// System.out.print(" ");
// }
// for(int l = 0; l < i; l++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// public int sum(int a, int b) {
// return a + b;
// }
// }

// now working on method or funtion
public class Loop {
  public static int c = 9;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Sum: " + sum(sc));
    functionCall();
    sc.close();
  }

  public static int sum(Scanner sc) {
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    return a + b;
  }

  public static void functionCall() {
    System.out.println("global variable: " + c);
  }

}
