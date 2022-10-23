package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
static Connection con;
public static Connection createC() {
	try {
		
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create the connection..
		String user ="root";
		String password ="Aditya9026@";
		String url = "jdbc:mysql://localhost:3306/classstudent";
		con = DriverManager.getConnection(url,user,password);
		//DriverManager.getConnection("jdbc:mysql://localhost:3306/classstudent","root","Aditya9026@");
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
