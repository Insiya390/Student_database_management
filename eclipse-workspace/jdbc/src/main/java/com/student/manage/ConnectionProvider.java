package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;
	
	public static Connection  createConnection() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "root";
			String password = "Nafisa786!";
			String url = "jdbc:mysql://localhost:3306/student_manage?useSSL=false";
			// jdbc:mysql://localhost:3306/Peoples?verifyServerCertificate=false&useSSL=true
			//jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&useSSL=false
			
			//create a connection
			con =  DriverManager.getConnection(url, user, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
