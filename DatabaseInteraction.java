import java.sql.*;

public class DatabaseInteraction {
    public static void queryData() {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM your_table")) {

            while (rs.next()) {
                // Process the data
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add methods for insert, update, delete, etc. as needed
}
