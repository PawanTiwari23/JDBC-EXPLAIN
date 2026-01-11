package com.in.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchDetails {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/pawan";
			String user="postgres";
			String pass="root";
			Connection conn= DriverManager.getConnection(url,user,pass);
			Statement stmt = conn.createStatement();
			ResultSet resultset = stmt.executeQuery("select * from test");
			while(resultset.next())
			{
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				System.out.println(resultset.getString(4));
				conn.close();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}


}
