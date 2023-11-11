import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;



public class TPC_DBAPI implements TPC_DBInterf {    
    // need constants for the tables, and fields. 

    // will need temporary objects to hold the data.
    // so that we can use region.display(and the field)
    
    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println("Connected to database");
            
                if (conn != null) {

                    readNation();

                    
                } else {
                    System.out.println("ERROR: Connection failed or lost.");
                }          
        } catch (SQLException e) {
            System.out.println("ERROR: SQL Exception");
            return;
        }
    }
    // connection to derby database
    public static Connection getConnection() throws SQLException {
        try {
            String dbURL = "jdbc:derby:/home/jason/JavaDB;create=true;user=class;password=123456";
            Connection conn = DriverManager.getConnection(dbURL);
            return conn;
        } catch (SQLException e) {
            System.out.println("ERROR: Could not connect to the database");
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void readNation() {
        try (Connection conn = getConnection()) {
            String query = "SELECT * FROM NATION";
            try (PreparedStatement stmt = conn.prepareStatement(query);
                 ResultSet resultSet = stmt.executeQuery()) {

                while (resultSet.next()) {
                    int nationKey = resultSet.getInt("N_NATIONKEY");
                    String name = resultSet.getString("N_NAME");
                    int regionKey = resultSet.getInt("N_REGIONKEY");
                    String comment = resultSet.getString("N_COMMENT");

                    // Process the data as needed, e.g., print to console
                    System.out.println("NationKey: " + nationKey + ", Name: " + name +
                            ", RegionKey: " + regionKey + ", Comment: " + comment);
                }
            }
        }
    }

    @Override
    public void readRegion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readRegion'");
    }

    @Override
    public void readPart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readPart'");
    }

    @Override
    public void readSupplier() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readSupplier'");
    }

    @Override
    public void readPartSupp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readPartSupp'");
    }

    @Override
    public void readCustomer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readCustomer'");
    }

    @Override
    public void readOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOrders'");
    }

    @Override
    public void readLineItem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readLineItem'");
    }

    @Override
    public void insertNation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertNation'");
    }

    @Override
    public void insertRegion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertRegion'");
    }

    @Override
    public void insertPart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPart'");
    }

    @Override
    public void insertSupplier() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertSupplier'");
    }

    @Override
    public void insertPartSupp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPartSupp'");
    }

    @Override
    public void insertCustomer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCustomer'");
    }

    @Override
    public void insertOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertOrders'");
    }

    
    @Override
    public void insertLineItem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertLineItem'");
    }
}