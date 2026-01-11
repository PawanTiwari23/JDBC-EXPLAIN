package com.in.Employee;

import java.sql.Connection;
import java.sql.Statement;

import com.in.Connection.DBConnaction1;

public class Employee {
	public static void main(String[] args) {
        try {
            Connection con =DBConnaction1.getDBConnection();
            Statement stmt = con.createStatement();

           
            String query = "CREATE TABLE IF NOT EXISTS Emp (id INT PRIMARY KEY, name VARCHAR(50), dipartment varchar(50), salary int, citys varchar(20))";
            
            stmt.execute(query);
            System.out.println("Table created or already exists.");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
