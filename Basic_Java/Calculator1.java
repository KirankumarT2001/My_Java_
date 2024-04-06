import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Welcome to Simple Calculator");
            System.out.println("Enter two numbers:");

            // Input two numbers
            System.out.print("Number 1: ");
            double num1 = scanner.nextDouble();

            System.out.print("Number 2: ");
            double num2 = scanner.nextDouble();

            // Choose operation
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            double result = 0;

            // Perform operation based on user choice
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
                        System.out.println("Error: Division by zero!");
                        continue; // Skip to next iteration
                    }
                    break;
                case 5:
                    exit = true;
                    break; // Exit the loop
                default:
                    System.out.println("Invalid choice!");
                    continue; // Skip to next iteration
            }

            // Display result
            System.out.println("Result: " + result);
        } while (!exit);

        System.out.println("Thank you for using Simple Calculator!");
        scanner.close();
    }
}
