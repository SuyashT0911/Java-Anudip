import java.sql.*;

public class jdbcExample {
    
    private static final String URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String USER = "root";
    private static final String PASSWORD = "suy@s#t@12309";
    
    // @SuppressWarnings("unused")
    // @SuppressWarnings("UseSpecificCatch")

    public static void main(String[] args) {
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to a database succesfully!");
            System.out.println(connection);
            createTable(connection);
            //insertData(connection, id, URL, URL);

            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    private static void createTable(Connection connection) throws SQLException{
        String createTableSQL = "CREATE TABLE IF NOT EXISTS user (" + "id INT PRIMARY KEY," +"name VARCHAR(100),"+ "email VARCHAR(100) UNIQUE);";
    
        try (Statement stmt = connection.createStatement()){
            stmt.execute(createTableSQL);
            System.out.println("Table user created successfully!");
        }
    }
    private static void insertData(Connection connection, int id, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";

        try ( PreparedStatement pstmt = connection.prepareStatement(insertSQL)){
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
            System.out.println("Inserted: "+ name);
        } 

        private static void retriveData(Connection connection) throws SQLException{
            String selectSQL = "SELECT * FROM users";

            try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL)){
                System.out.println("User Data:");
                while (rs.next()){
                    System.out.println("ID: "+ rs.getInt("id")+",Name:"+ rs.getString("name") +",Name:"+ rs.getString("email"));
                }
            }
        }
        
        private static void updateData(Connection connection, int id, String newEmail) throws SQLException{
            String updateSQL = "UPDATE users SET email = ? WHERE id = ?";

            try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
                pstmt.setString(1, newEmail);
                pstmt.setInt(2, id);
                pstmt.executeUpdate();
                System.out.println("Updated email for ID: "+ id);
            }
        }

    }
}
