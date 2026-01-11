package com.in.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnaction1 {
	public static Connection getDBConnection() {
		Connection conn=null;
		String url="jdbc:postgresql://localhost:5432/pawan";
		String user="postgres";
		String pass="root";
		try {
			
			Class.forName("org.postgresql.Driver"); 
			conn=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection sucessfull");
		} catch(Exception e){
			e.printStackTrace();
		}
		return conn;
		
	}

}
