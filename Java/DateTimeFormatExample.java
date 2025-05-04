import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
    public static void main(String[] args) {
        // Create a LocalDateTime object with the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        // Define the format for the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        // Format the date-time object
        String formattedDateTime = currentDateTime.format(formatter);
        
        // Print the formatted date-time
        System.out.println("Formatted Date-Time: " + formattedDateTime);
    }
}
