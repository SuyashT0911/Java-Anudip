import java.util.Scanner;

@FunctionalInterface
interface ArithmeticOperation {
    double operate(double a, double b);
}

public class ArithmeticOperationsUsingLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lambda expressions for arithmetic operations
        ArithmeticOperation addition = (a, b) -> a + b;
        ArithmeticOperation subtraction = (a, b) -> a - b;
        ArithmeticOperation multiplication = (a, b) -> a * b;
        ArithmeticOperation division = (a, b) -> b != 0 ? a / b : Double.NaN; // Handle division by zero

        // Take user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();

        // Perform operations and print results
        System.out.println("\nResults:");
        System.out.println("Addition: " + addition.operate(num1, num2));
        System.out.println("Subtraction: " + subtraction.operate(num1, num2));
        System.out.println("Multiplication: " + multiplication.operate(num1, num2));
        System.out.println("Division: " + (num2 != 0 ? division.operate(num1, num2) : "Cannot divide by zero"));
    }
}
