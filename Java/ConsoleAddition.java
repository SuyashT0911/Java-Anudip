import java.io.Console;

public class ConsoleAddition {
    public static void main(String[] args) {
        // Get the Console instance
        Console console = System.console();

        // Check if the console is available (Works only in command prompt/terminal)
        if (console == null) {
            System.out.println("No console available. Please run the program in a command prompt or terminal.");
            return;
        }

        // Read first number from console
        String num1Str = console.readLine("Enter first number: ");
        String num2Str = console.readLine("Enter second number: ");

        try {
            // Convert Strings to integers
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            // Perform addition
            int sum = num1 + num2;

            // Print result
            System.out.println("The sum is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }
    }
}
