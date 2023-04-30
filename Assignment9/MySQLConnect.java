package Assignment9;
import java.sql.*;

public class MySQLConnect {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String dbURL = "jdbc:mysql://localhost:3306/vihandb";
            String username = "root";
            String password = "Vihan@1712";
            conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Connected to the database");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred while connecting to the database: " + ex.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Disconnected from the database");
                }
            } catch (SQLException ex) {
                System.out.println("An error occurred while closing the connection: " + ex.getMessage());
            }
        }
    }
}

