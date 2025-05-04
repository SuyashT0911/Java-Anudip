import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class db {

    @SuppressWarnings({"ConvertToTryWithResources", "UseSpecificCatch", "CallToPrintStackTrace"})
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "suy@s#t@12309";
        String databaseName = "myDb";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);

            String sql = "CREATE DATABASE IF NOT EXISTS " + databaseName;

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Database '" + databaseName + "' created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error creating database: " + e.getMessage());
        }
    }
}
