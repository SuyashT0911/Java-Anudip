import java.sql.*;
import java.util.Scanner;

public class jdbcForGitHub {
    
    private static final String URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String USER = "root";
    private static final String PASSWORD = "suy@s#t@12309";
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");

            // Create table if not exists
            createTable(connection);

            // Menu for CRUD operations
            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Insert Data");
                System.out.println("2. Retrieve Data");
                System.out.println("3. Update Data");
                System.out.println("4. Delete Data");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        insertData(connection, id, name, email);
                        break;
                    case 2:
                        retriveData(connection);
                        break;
                    case 3:
                        System.out.print("Enter ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new Email: ");
                        String newEmail = scanner.nextLine();
                        updateData(connection, updateId, newEmail);
                        break;
                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = scanner.nextInt();
                        deleteData(connection, deleteId);
                        break;
                    case 5:
                        closeConnection(connection);
                        System.out.println("Exiting program.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    private static void createTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                                "id INT PRIMARY KEY, " +
                                "name VARCHAR(100), " +
                                "email VARCHAR(100) UNIQUE)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Table 'users' created successfully!");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    private static void insertData(Connection connection, int id, String name, String email) {
        String insertSQL = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
            System.out.println("Inserted: " + name);
        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }

    private static void retriveData(Connection connection) {
        String selectSQL = "SELECT * FROM users";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            System.out.println("User Data:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving data: " + e.getMessage());
        }
    }

    private static void updateData(Connection connection, int id, String newEmail) {
        String updateSQL = "UPDATE users SET email = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Updated email for ID: " + id);
        } catch (SQLException e) {
            System.out.println("Error updating data: " + e.getMessage());
        }
    }

    private static void deleteData(Connection connection, int id) {
        String deleteSQL = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Deleted user with ID: " + id);
        } catch (SQLException e) {
            System.out.println("Error deleting data: " + e.getMessage());
        }
    }

    private static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}