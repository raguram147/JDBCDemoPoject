package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
 private static Connection conn;
  private static final String  className = "com.mysql.jdbc.Driver";
  private static final String dbURL = "jdbc:mysql://localhost:3306/b";
  private static final 	String username = "root";
  private static final String password = "root";
 	public static Connection  getConnection() {
 		
 		
 			try {
				Class.forName(className);
				conn=DriverManager.getConnection(dbURL,username,password);  
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 			 
 		
 		return conn;
 	}
}
