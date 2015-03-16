import java.sql.*; // The star ( * ) indicates that all of the classes in the package java.sql are to be      imported.
public class odbc_retrieve {
    public static void main (String[] args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // It loads class in memory. and while loading, it also calls static block of the class, which can instantiate the object and register it with DriverManager. DriverManager manages the set of Java Database Connectivity (JDBC) drivers that are available for an application to use.
            
            Connection cobj = DriverManager.getConnection("jdbc:odbc:testDB");  // getConnection() method is used to establish a connection to a database.
            
            Statement st = cobj.createStatement(); // A statement object is used to send and execute SQL statements to a database.
            
            ResultSet ob = st.executeQuery("select * from employee"); // returns a ResultSet object from which the result data can be read.
            
            while(ob.next()) // The next() method is used to successively step through the rows of the tabular results.
            {
                System.out.println(ob.getString(1) + ob.getString(2));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace(); // method to print exceptional error
        }
        
    }	
    
}
