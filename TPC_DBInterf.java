

public interface TPC_DBInterf {
    // try to use java.sql.ResultSet when we get this part working. 
    
    
    // abstract method for reading records from 'Nation' table
    public abstract void readNation();
    // abstract method for reading records from 'Region' table
    public abstract void readRegion();
    // abstract method for reading records from 'Part' table
    public abstract void readPart();
    // abstract method for reading records from 'Supplier' table
    public abstract void readSupplier();
    // abstract method for reading records from 'PartSupp' table
    public abstract void readPartSupp();
    // abstract method for reading records from 'Customer' table
    public abstract void readCustomer();
    // abstract method for reading records from 'Orders' table
    public abstract void readOrders();
    // abstract method for reading records from 'LineItem' table
    public abstract void readLineItem();
    // abstract method for inserting new 'Nation' record
    public abstract void insertNation();
    // abstract method for inserting new 'Region' record
    public abstract void insertRegion();
    // abstract method for inserting new 'Part' record
    public abstract void insertPart();
    // abstract method for inserting new 'Supplier' record
    public abstract void insertSupplier();
    // abstract method for inserting new 'PartSupp' record
    public abstract void insertPartSupp();
    // abstract method for inserting new 'Customer' record
    public abstract void insertCustomer();
    // abstract method for inserting new 'Orders' record
    public abstract void insertOrders();
    // abstract method for inserting new 'LineItem' record
    public abstract void insertLineItem();

}

/*
 * CREATE TABLE NATION (
    N_NATIONKEY INTEGER NOT NULL,
    N_NAME      CHAR(25) NOT NULL,
    N_REGIONKEY INTEGER NOT NULL,
    N_COMMENT   VARCHAR2(152),
    PRIMARY KEY (N_NATIONKEY));
    **FOREIGN KEY(N_REGIONKEY) REFERENCES REGION(R_REGIONKEY)**

CREATE TABLE REGION (
    R_REGIONKEY INTEGER NOT NULL,
    R_NAME      CHAR(25) NOT NULL,
    R_COMMENT   VARCHAR2(152),
    PRIMARY KEY (R_REGIONKEY));

CREATE TABLE  PART (
    P_PARTKEY     INTEGER NOT NULL,
    P_NAME        VARCHAR2(55) NOT NULL,
    P_MFGR        CHAR(25) NOT NULL,
    P_BRAND       CHAR(10) NOT NULL,
    P_TYPE        VARCHAR2(25) NOT NULL,
    P_SIZE        INTEGER NOT NULL,
    P_CONTAINER   CHAR(10) NOT NULL,
    P_RETAILPRICE DECIMAL(15,2) NOT NULL,
    P_COMMENT     VARCHAR2(23) NOT NULL,
    PRIMARY KEY (P_PARTKEY));

CREATE TABLE  SUPPLIER (
    S_SUPPKEY   INTEGER NOT NULL, 
    S_NAME      CHAR(25) NOT NULL,
    S_ADDRESS   VARCHAR2(40) NOT NULL,
    S_NATIONKEY INTEGER NOT NULL,
    S_PHONE     CHAR(15) NOT NULL,
    S_ACCTBAL   DECIMAL(15,2) NOT NULL,
    S_COMMENT   VARCHAR2(101) NOT NULL,
    PRIMARY KEY (S_SUPPKEY),
    FOREIGN KEY(S_NATIONKEY) REFERENCES NATION(N_NATIONKEY));

CREATE TABLE PARTSUPP (
    PS_PARTKEY    INTEGER NOT NULL,
    PS_SUPPKEY    INTEGER NOT NULL,
    PS_AVAILQTY   INTEGER NOT NULL,
    PS_SUPPLYCOST DECIMAL(15,2) NOT NULL,
    PS_COMMENT    VARCHAR2(199) NOT NULL,
    PRIMARY KEY (PS_PARTKEY, PS_SUPPKEY),
    FOREIGN KEY(PS_PARTKEY) REFERENCES PART(P_PARTKEY),
    FOREIGN KEY(PS_SUPPKEY) REFERENCES SUPPLIER(S_SUPPKEY));

CREATE TABLE CUSTOMER (
    C_CUSTKEY    INTEGER NOT NULL,
    C_NAME       VARCHAR2(25) NOT NULL,
    C_ADDRESS    VARCHAR2(40) NOT NULL,
    C_NATIONKEY  INTEGER NOT NULL,
    C_PHONE      CHAR(15) NOT NULL,
    C_ACCTBAL    DECIMAL(15,2) NOT NULL,
    C_MKTSEGMENT CHAR(10) NOT NULL,
    C_COMMENT    VARCHAR2(117) NOT NULL,
    PRIMARY KEY (C_CUSTKEY),
    FOREIGN KEY(C_NATIONKEY) REFERENCES NATION(N_NATIONKEY));

CREATE TABLE ORDERS (
    O_ORDERKEY      INTEGER NOT NULL,
    O_CUSTKEY       INTEGER NOT NULL,
    O_ORDERSTATUS   CHAR(1) NOT NULL,
    O_TOTALPRICE    DECIMAL(15,2) NOT NULL,
    O_ORDERDATE     DATE NOT NULL,
    O_ORDERPRIORITY CHAR(15) NOT NULL,
    O_CLERK         CHAR(15) NOT NULL,
    O_SHIPPRIORITY  INTEGER NOT NULL,
    O_COMMENT       VARCHAR2(79) NOT NULL,
    PRIMARY KEY (O_ORDERKEY),
    FOREIGN KEY(O_CUSTKEY) REFERENCES CUSTOMER(C_CUSTKEY));

CREATE TABLE LINEITEM (
    L_ORDERKEY      INTEGER NOT NULL ,
    L_PARTKEY       INTEGER NOT NULL,
    L_SUPPKEY       INTEGER NOT NULL,
    L_LINENUMBER    INTEGER NOT NULL,
    L_QUANTITY      DECIMAL(15,2) NOT NULL,
    L_EXTENDEDPRICE DECIMAL(15,2) NOT NULL,
    L_DISCOUNT      DECIMAL(15,2) NOT NULL,
    L_TAX           DECIMAL(15,2) NOT NULL,
    L_RETURNFLAG    CHAR(1) NOT NULL,
    L_LINESTATUS    CHAR(1) NOT NULL,
    L_SHIPDATE      DATE NOT NULL,
    L_COMMITDATE    DATE NOT NULL,
    L_RECEIPTDATE   DATE NOT NULL,
    L_SHIPINSTRUCT  CHAR(25) NOT NULL,
    L_SHIPMODE      CHAR(10) NOT NULL,
    L_COMMENT       VARCHAR(44) NOT NULL,
    PRIMARY KEY (L_ORDERKEY, L_LINENUMBER),
    FOREIGN KEY(L_ORDERKEY) REFERENCES ORDERS(O_ORDERKEY),
    FOREIGN KEY(L_PARTKEY) REFERENCES PART(P_PARTKEY),
    FOREIGN KEY(L_SUPPKEY) REFERENCES SUPPLIER(S_SUPPKEY),
    FOREIGN KEY(L_PARTKEY,L_SUPPKEY) REFERENCES PARTSUPP(PS_PARTKEY,PS_SUPPKEY));
 */