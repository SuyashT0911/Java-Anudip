import java.time.Month;

public class MonthDaysExample {
    public static void main(String[] args) {
        for (Month month : Month.values()) { // Loop through all months
            int days = month.length(false); // Get number of days (false = non-leap year)
            System.out.println(month.name() + ": " + days + " days"); // Print month name and days
        }
    }
}
