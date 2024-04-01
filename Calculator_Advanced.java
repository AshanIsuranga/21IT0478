import java.util.Scanner;

public class Calculator_Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Simple Calculator!");
        
        while (true) {
            double num1 = getUserInput(scanner, "Enter the first number: ");
            double num2 = getUserInput(scanner, "Enter the second number: ");
            
            int choice = getUserChoice(scanner);
            
            double result = calculateResult(num1, num2, choice);
            if (result != Double.MIN_VALUE) {
                System.out.println("Result: " + result);
            }
        }
    }
    
    public static double getUserInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }
    
    public static int getUserChoice(Scanner scanner) {
        System.out.println("Choose operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1/2/3/4/5): ");
        return scanner.nextInt();
    }
    
    public static double calculateResult(double num1, double num2, int choice) {
        double result = Double.MIN_VALUE;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            case 5:
                System.out.println("Exiting Calculator...");
                System.exit(0); // exit the program
            default:
                System.out.println("Invalid choice!");
        }
        
        return result;
    }
}
