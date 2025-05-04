import java.util.*;
import java.util.stream.Collectors;

public class ConcatenateStringsUsingStream {
    public static void main(String[] args) {
        // Create a list to store user input strings
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings (type 'exit' to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            stringList.add(input);
        }
        scanner.close();

        // Concatenate strings using Stream API (without lambda)
        String concatenatedString = stringList.stream()
                                              .collect(Collectors.joining(" ")); // Joins with a space

        // Print the concatenated string
        System.out.println("\nConcatenated String:");
        System.out.println(concatenatedString);
    }
}
