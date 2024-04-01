import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("well come to the calculator");

        while (true) {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("choose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("6. Power (**)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            double result;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Calculator...");
                    scanner.close();
                    return; // exit the program

                default:
                    System.out.println("Invalid choice!");
            }
        }

    }
}