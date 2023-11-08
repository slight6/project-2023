import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:derby://localhost:1527/home/jason/derby-db/db;create=true";
    private static final String USERNAME = "your_username"; // If applicable
    private static final String PASSWORD = "your_password"; // If applicable

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
