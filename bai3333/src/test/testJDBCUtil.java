package test;

import java.sql.Connection;
import java.sql.SQLException;

import database.JDBCUtil;

public class testJDBCUtil {
	public static void main(String [] agrs) {
		Connection connection = null;
        JDBCUtil jdbcUtil = new JDBCUtil();  // Create an instance of JDBCUtil
        connection = jdbcUtil.getConnection(); // Call getConnection using the instance
        System.out.println(connection);  
        if (connection != null) {
            System.out.println("Kết nối thành công!");
           
        } else {
            System.out.println("Kết nối không thành công!");
        }
        jdbcUtil.printfInfo(connection);
//	    try {
//			connection.close();
//			System.out.println(connection); 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        jdbcUtil.closeConnection(connection);
	   
	}
	
}
