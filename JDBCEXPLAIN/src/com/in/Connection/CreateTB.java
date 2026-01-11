package com.in.Connection;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTB {
	public static void main(String[] args) {
        try {
            Connection con =DBConnaction1.getDBConnection();
            Statement stmt = con.createStatement();

           
            String query = "CREATE TABLE IF NOT EXISTS test (id INT PRIMARY KEY, name VARCHAR(50), course varchar(50), mobile varchar(20))";
            
            stmt.execute(query);
            System.out.println("Table created or already exists.");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
