import java.util.Scanner;
// import java.lang.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nSimple Calculator");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Modulo");
            System.out.println("6) Power");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");
            int opt = readInt(sc);
            if (opt == 0) {
                System.out.println("Goodbye.");
                break;
            }
            double a = readDouble(sc, "Enter first number: ");
            double b = readDouble(sc, "Enter second number: ");
            switch (opt) {
                case 1 -> System.out.println("Result: " + (a + b));
                case 2 -> System.out.println("Result: " + (a - b));
                case 3 -> System.out.println("Result: " + (a * b));
                case 4 -> {
                    if (b == 0) System.out.println("Error: Division by zero");
                    else System.out.println("Result: " + (a / b));
                }
                case 5 -> {
                    if (b == 0) System.out.println("Error: Modulo by zero");
                    else System.out.println("Result: " + (a % b));
                }
                case 6 -> System.out.println("Result: " + Math.pow(a, b));
                default -> System.out.println("Invalid option.");
            }
        }
        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next(); // discard
            System.out.print("Please enter a valid integer: ");
        }
        return sc.nextInt();
    }

    private static double readDouble(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            sc.next(); // discard
            System.out.print("Please enter a valid number: ");
        }
        return sc.nextDouble();
    }
}
