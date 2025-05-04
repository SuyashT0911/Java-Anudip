import java.util.Scanner;

@FunctionalInterface
interface StringOperation {
    String operate(String str);
}

public class StringManipulationUsingLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lambda expression to convert to uppercase
        StringOperation toUpperCase = str -> str.toUpperCase();

        // Lambda expression to convert to lowercase
        StringOperation toLowerCase = str -> str.toLowerCase();

        // Lambda expression to reverse the string
        StringOperation reverseString = str -> new StringBuilder(str).reverse().toString();

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Perform operations and print results
        System.out.println("\nUppercase: " + toUpperCase.operate(input));
        System.out.println("Lowercase: " + toLowerCase.operate(input));
        System.out.println("Reversed: " + reverseString.operate(input));
    }
}
