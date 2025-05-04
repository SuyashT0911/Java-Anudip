import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {
    public static void main(String[] args) {
        // Create a list of strings (with duplicates)
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

        // Remove duplicates using Stream API (without lambda)
        List<String> uniqueList = stringList.stream()
                                            .distinct()
                                            .collect(Collectors.toList());

        // Print the list after removing duplicates
        System.out.println("\nList after removing duplicates:");
        uniqueList.forEach(System.out::println);
    }
}
