package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
//    private static final String dbName = "Vidu";
//    private static final String dbUrl = "jdbc:sqlserver://LAPTOP-RFH2LVGG\\SQLSERVER1:1433;"
//            + "user=sa;password=sa;integratedSecurity=true;"
//            + "encrypt=false;trustStore=storeName;trustStorePassword=storePassword;"
//            + "databaseName=" + dbName;
        String dbUrl = "jdbc:sqlserver://LAPTOP-RFH2LVGG\\SQLSERVER1:1433;databaseName=Vidu;user=sa;password=saa;encrypt=false;";

    public Connection getConnection() {
        Connection connection = null;
        try {
            // Load the SQL Server JDBC driver
           // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establish the connection
            connection = DriverManager.getConnection(dbUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void printfInfo(Connection connection) {
    	if(connection !=null) {
    		try {
    			DatabaseMetaData mtdt = connection.getMetaData();
    			System.out.println(mtdt.getDatabaseProductName());
    			System.out.println(mtdt.getDatabaseMajorVersion());
    			System.out.println(mtdt.getDatabaseProductVersion());
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    	}
    }
  
}	
