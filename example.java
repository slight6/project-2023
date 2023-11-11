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