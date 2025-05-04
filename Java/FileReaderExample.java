import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "input.txt"; // Change this to your file's path
        int charCount = 0;

        try (FileReader reader = new FileReader(filePath)) {
            int character;

            // Read character by character until end of file (-1)
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Print each character
                charCount++;
            }

            System.out.println("\nTotal number of characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
