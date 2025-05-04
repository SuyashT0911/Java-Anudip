import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = sc.nextInt();
                System.out.println("You entered: " + number);
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next(); // Clear the invalid input
            }
        }
        
        sc.close();
    }
}