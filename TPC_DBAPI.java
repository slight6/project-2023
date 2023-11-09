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
            
                Scanner userInput = new Scanner(System.in);

                if (conn != null) {

                    System.out.println("Demo of TPC-DB API. This is the rough draft for initializing, reading, and inserting data into the database.");
                    System.out.println("This is just to be used as a reference for the methods that will be used in the final project.");
                    System.out.println(" ---------------------- ");
                    System.out.println("| 1. Read              |");
                    System.out.println("| 2. Insert            |");
                    System.out.println("| 3. Initialize        |");
                    System.out.println("| 4. Exit              |");
                    System.out.println(" ---------------------- ");
                    System.out.print("Please enter a number: ");

                    int option = userInput.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Read");
                            break;
                        case 2:
                            System.out.println("Insert");
                            break;
                        case 3:
                            initializeDatabase(conn);
                            break;
                        case 4:
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    } 

                }

            userInput.close();
           // conn.close();
                        
        } catch (SQLException e) {
            System.out.println("ERROR: Could not connect to the database");
            return;
        }

    }
    public static void initializeDatabase(Connection conn) {
        
        System.out.println(" --------------------- ");
        System.out.println("| INITIALIZE DATABASE | ");
        System.out.println("| 1. Region           |");
        System.out.println("| 2. Nation           |");
        System.out.println("| 3. Part             |");
        System.out.println("| 4. Supplier         |");
        System.out.println("| 5. PartSupp         |");
        System.out.println("| 6. Customer         |");
        System.out.println("| 7. Orders           |");
        System.out.println("| 8. LineItem         |");
        System.out.println(" --------------------- ");
        System.out.print("Please enter a number: ");
        

        Scanner userInput = new Scanner(System.in);
        
        int option = userInput.nextInt();
        

        switch (option) {
            case 1:
                initializeRegion(conn);
                break;
            case 2:
                initializeNation(conn);
                break;
            case 3:
                initializePart(conn);
                break;
            case 4:
                initializeSupplier(conn);
                break;
            case 5:
                initializePartSupp(conn);
                break;
            case 6:
                initializeCustomer(conn);
                break;
            case 7:
                initializeOrders(conn);
                break;
            case 8:
                initializeLineItem(conn);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    
        userInput.close();
}

    public static void initializeRegion(Connection conn) {
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

    public static void initializeNation(Connection conn) {
        try {
            System.out.println("Inserting data into nation table");
            String insertSQL = "INSERT INTO NATION VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            File file = new File("/home/jason/project-2023/data/nation.tbl");
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

    public static void initializePart(Connection conn) {
        try {
            System.out.println("Inserting data into part table");
            String insertSQL = "INSERT INTO PART VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            File file = new File("/home/jason/project-2023/data/part.tbl");
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

    public static void initializeSupplier(Connection conn) {
        try {
            System.out.println("Inserting data into supplier table");
            String insertSQL = "INSERT INTO SUPPLIER VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            File file = new File("/home/jason/project-2023/data/supplier.tbl");
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

    public static void initializePartSupp(Connection conn) {
        try {
            System.out.println("Inserting data into partsupp table");
            String insertSQL = "INSERT INTO PARTSUPP VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            File file = new File("/home/jason/project-2023/data/partsupp.tbl");
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

    public static void initializeCustomer(Connection conn) {
        try {
            System.out.println("Inserting data into customer table");
            String insertSQL = "INSERT INTO CUSTOMER VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            File file = new File("/home/jason/project-2023/data/customer.tbl");
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

    public static void initializeOrders(Connection conn) {
        try {
            System.out.println("Inserting data into orders table");
            String insertSQL = "INSERT INTO ORDERS VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            File file = new File("/home/jason/project-2023/data/orders.tbl");
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

    public static void initializeLineItem(Connection conn) {
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

    
    @Override
    public void insertLineItem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertLineItem'");
    }
}