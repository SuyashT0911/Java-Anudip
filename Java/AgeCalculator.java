import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Take date of birth as input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String dobString = scanner.nextLine();
        scanner.close();

        // Parse date of birth string to LocalDateTime
        LocalDateTime dob = LocalDateTime.parse(dobString + "T00:00:00");
        
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Calculate age
        int age = now.getYear() - dob.getYear();
        if (now.getMonthValue() < dob.getMonthValue() ||
            (now.getMonthValue() == dob.getMonthValue() && now.getDayOfMonth() < dob.getDayOfMonth())) {
            age--;
        }

        // Format date in dd/mm/yyyy HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedNow = now.format(formatter);

        // Print formatted date and current age
        System.out.println("Formatted current date and time: " + formattedNow);
        System.out.println("Your current age is: " + age + " years");
    }
}
