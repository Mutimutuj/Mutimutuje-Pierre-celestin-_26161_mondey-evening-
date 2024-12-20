package ExceptionHandlings;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to connect to a non-existent database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/invalidDB", "user", "password");
        } catch (SQLException e) {
            // Handling SQLException when database connection fails
            System.out.println("SQLException: Unable to connect to the database.");
        }
    }
}
