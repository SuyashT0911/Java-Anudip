import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> set = new HashSet<>();

        // Add numbers 5, 10, 15, 20, and 25 to the set
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);

        // Display the elements of the set
        System.out.println("HashSet elements: " + set);

        // Check if the set contains the number 10
        if (set.contains(10)) {
            System.out.println("HashSet contains 10");
        } else {
            System.out.println("HashSet does not contain 10");
        }

        // Remove the number 15 from the set
        set.remove(15);
        System.out.println("After removing 15, HashSet elements: " + set);

        // Display the size of the set
        System.out.println("Size of HashSet: " + set.size());
    }
}
