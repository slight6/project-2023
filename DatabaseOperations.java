import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations {
    public static void createTable() {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            String createTableSQL = "CREATE TABLE example_table (id INT PRIMARY KEY, name VARCHAR(255))";
            stmt.executeUpdate(createTableSQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
