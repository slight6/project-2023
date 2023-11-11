
public interface TPC_DBInterf {
    // try to use java.sql.ResultSet when we get this part working. 
    
    
    public abstract void readNation();
    public abstract void readRegion();
    public abstract void readPart();
    public abstract void readSupplier();
    public abstract void readPartSupp();
    public abstract void readCustomer();
    public abstract void readOrders();
    public abstract void readLineItem();


    public abstract void insertNation();
    public abstract void insertRegion();
    public abstract void insertPart();
    public abstract void insertSupplier();
    public abstract void insertPartSupp();
    public abstract void insertCustomer();
    public abstract void insertOrders();
    public abstract void insertLineItem();

}
