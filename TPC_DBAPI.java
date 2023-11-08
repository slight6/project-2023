 import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class TPC_DBAPI implements TPC_DBInterf {
    
    
    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println("Connected to database");
            
            // just to stop the warning
            
                System.out.println("Demo of TPC-DB API. This will only insert data into the lineitem table.");
                System.out.print("Will you be reading or inserting data? (r/i): ");
                Scanner userInput = new Scanner(System.in);
                String c = userInput.next();

                if (conn != null) {
                    System.out.println("not null");

                    insertRegion(conn);
                    insertLineItem(conn);

                }
                
                
              
            

            userInput.close();
           // conn.close();
                        
        } catch (SQLException e) {
            System.out.println("ERROR: Could not connect to the database");
            return;
        }

    }

    private static void insertRegion(Connection conn) {
        try {
            System.out.println("Inserting data into region table");
            String insertSQL = "INSERT INTO REGION VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            File file = new File("/home/jason/project-2023/data/region.tbl");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null) {
                String[] values = line.split("\\|");

                for (int i = 0; i < values.length; i++) {
                    ps.setString(i + 1, values[i]);
                }
                ps.executeUpdate();
            }
            ps.close();
            br.close();
            fr.close();
        } catch (SQLException e) {
            System.out.println("ERROR: Could not insert data into the database");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("ERROR: Could not read file");
            e.printStackTrace();
            return;
        }
    }

    private static void insertLineItem(Connection conn) {
        try {
            System.out.println("Inserting data into lineitem table");
            String insertSQL = "INSERT INTO LINEITEM VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            File file = new File("/home/jason/project-2023/data/lineitem.tbl");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null) {
                String[] values = line.split("\\|");

                for (int i = 0; i < values.length; i++) {
                    ps.setString(i + 1, values[i]);
                }
                ps.executeUpdate();
            }
            ps.close();
            br.close();
            fr.close();
        } catch (SQLException e) {
            System.out.println("ERROR: Could not insert data into the database");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("ERROR: Could not read file");
            e.printStackTrace();
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
            System.out.println("ERROR-2: Could not connect to the database");
            e.printStackTrace();
            return null;
        }
    }
    
    

    @Override
    public void readNation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readNation'");
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

    /* 
    public static void insertLineItem(Connection conn) {
        conn = getConnection();
        String insertSQL = "INSERT INTO lineitem VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(insertSQL);
        File file = new File("/home/jason/project-2023/data/lineitem.tbl");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
    }
    */

    @Override
    public void insertLineItem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertLineItem'");
    }
}