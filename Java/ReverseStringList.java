import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();

        // Add some strings to the list
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");
        stringList.add("Go");

        // Display original list
        System.out.println("Original List: " + stringList);

        // Reverse the list
        Collections.reverse(stringList);

        // Display reversed list
        System.out.println("Reversed List: " + stringList);
    }
}
