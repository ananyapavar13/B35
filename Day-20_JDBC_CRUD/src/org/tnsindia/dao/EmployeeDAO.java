package org.tnsindia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeDAO {

	public Connection createConnection()
	{
		String url="jdbc:mysql://127.0.0.1:3306/b35";
		String user="root";
		String password="123456";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		
		Connection c;
		
		try {
		c=DriverManager.getConnection(url,user,password);
		}catch(SQLException e) {
		System.out.println("Kindly check the URL/USER/PASSWORD");
		c=null;
		}
		return c;
	}
}
