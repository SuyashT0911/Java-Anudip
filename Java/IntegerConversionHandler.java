import java.util.Scanner;

public class IntegerConversionHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                String input = sc.nextLine();
                number = Integer.parseInt(input);
                System.out.println("You entered: " + number);
                break; // Exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            } catch (NullPointerException e) {
                System.out.println("Input cannot be null! Please enter a valid integer.");
            }
        }
        
        sc.close();
    }
}