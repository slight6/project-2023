
# Team Project - December 1, 2023 - Stephen Johnson - Advanced Java

## General Objective(s) - Create a database software application called "TPC-H Performance Benchmark"

### The software will be used to generate the performance benchmark.
TPC (Transactions Processing Performance Council) is a non-profit organization that provides a standardized
used benchmarks for testing the performance and the scalability of database systems and workloads such as
Decision Support Systems (DSS) and Online Transaction Processing (OLTP) applications

## Team A (Database and Interface Creation, Software Integration)
    Jason Consiglio (Team Leader), Taramina, Calvin

1. Create a “JavaDB” database that contains all required eight tables as specified in Figure 2
   “The TPC-H Schema”, p. 121.
   This includes populating the database with the information in the 1GB dataset2.

2. Create the “TPC_DBInterf” interface that defines all the abstract methods for reading all the records
   of the database tables and providing insert capabilities in the “Part” & “Region” tables.
   
        a. Requires at least 8 abstract methods (i.e., read<TableName>, insertPart, insertRegion).
            i. The “read” methods return an object reference with fields equivalent to the table types.
            ii. The insert methods are passed object arguments with fields equivalent to the table type.
        b. Requires constant identifiers for all column names
        c. Requires constant identifiers for all table names

3. Create the “TPC_DBAPI” class (i.e., provides services for DML) to perform the following:

        a. Connects to the database that contains the tables.
        b. Create methods that will allow users to retrieve data from all tables using the methods from the
        interface (i.e., implements the “TPC_DBInterf” interface).
        c. Provides a method for getting the connection object.

4. Build & submit the complete application using source code developed by all the teams.
   The completed application must include the following:
        
        a. Source code for all application classes
        b. SQL scripts (i.e., run from “ij” tool) for building the JavaDB database
            i. Script for database creation (i.e., all tables & constraints)
            ii. Script for loading all the data
        c. Packaged compiled code (including JavaDB Embedded Database) for running the application

1 TPC BenchmarkTM H Standard Specification Revision 2.14.3
2 The TPC-H Benchmark has a data generator application used to create datasets of different sizes.
  The application can be download from the TPC website; designed to run on a Linux platform.
  Revision Date: 03/6/2020 2 of 3

## Team B (Database Application Development)
    Jorge(Team Leader), John, Michelle, Gregory

1. Create multiple “JTable” components that will display the data from the TPC-H database (i.e., tables are
   “Region”, “Nation”, “Supplier”, & “LineItem”) as specified in Figure 2 “The TPC-H Schema”, p. 12 (see Note 1).
   In addition, provide a button that will display a dialog box with fields for data to insert into the
   “Region” table.
   After the insert the “JTable” displaying the “Region” table should update.

## Team C (Database Application Development)
    Nathan(Team Leader), Bonifer, Ian, Frank

1. Create multiple “JTable” components that will display the data from the TPC-H database (i.e., tables are “Part”,
   “PartSupp”, “Customer”, & “Orders”) as specified in Figure 2 “The TPC-H Schema”, p. 12 (see Note 1).
   In addition, provide a button that will display a dialog box with fields for data to insert into the “Part” table.
   After the insert the “JTable” displaying the “Part” table should update.
   Revision Date: 03/6/2020 3 of 3


Notes:

1. Team A will produce the database artifacts (i.e., tables, interface, & API).
   The Derby documentation will be extremely helpful for explaining “Importing & Exporting Data”
   (i.e., Derbyadmin.pdf) and using “ij” (i.e., DerbyTools.pdf).
   During Team A development of the database, Team B & Team C can use the “TPC_DBInterf” interface to write the code
   for the "TPC_DBAPI" class based on using the flat data files as sources for the JTables.
   Once the database is complete, it should be an easy modification to use “Team A’s” API to compile and run your
   application using the actual database.
2. The “Java Tutorial” has a section that provides a complete description of working with the JTable. Enable sorting
   the entries by all the columns

