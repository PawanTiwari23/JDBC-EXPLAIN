package com.in.CAR;

import java.sql.Connection;
import java.sql.Statement;

import com.in.Connection.DBConnaction1;

public class CarCURD {
	public static void main(String[] args) {
        try {
            Connection con =DBConnaction1.getDBConnection();
            Statement stmt = con.createStatement();

           
            String query = "CREATE TABLE IF NOT EXISTS car (id INT PRIMARY KEY, brand VARCHAR(50), model varchar(50), price varchar(20), color varchar(20) )";
            
            stmt.execute(query);
            System.out.println("Table created or already exists.");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
