package com.in.Mobile;

import java.sql.Connection;
import java.sql.Statement;

import com.in.Connection.DBConnaction1;

public class Mobile {
	public static void main(String[] args) {
        try {
            Connection con =DBConnaction1.getDBConnection();
            Statement stmt = con.createStatement();

           
            String query = "CREATE TABLE IF NOT EXISTS mobile (id INT PRIMARY KEY, Brandname VARCHAR(50), price int, ram varchar(20))";
            
            stmt.execute(query);
            System.out.println("Table created or already exists.");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
