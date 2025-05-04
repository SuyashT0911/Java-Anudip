import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HotPotatoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> players = new LinkedList<>();

        // Enqueue player names
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter name of player " + i + ": ");
            String name = scanner.nextLine();
            players.add(name);
        }

        System.out.print("Enter the number of passes before the music stops: ");
        int passes = scanner.nextInt();

        // Simulate the game
        while (players.size() > 1) {
            // Pass the potato
            for (int i = 0; i < passes; i++) {
                String player = players.poll(); // dequeue
                players.offer(player);         // enqueue again
            }

            // Player holding the potato is eliminated
            String eliminated = players.poll();
            System.out.println("Eliminated: " + eliminated);
        }

        // Display the winner
        System.out.println("Winner: " + players.peek());

        scanner.close();
    }
}
