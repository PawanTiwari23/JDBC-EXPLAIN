package com.in.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.in.Connection.DBConnaction1;

public class InsertEmp {
	public static void main(String[] args) {
        try {
        	 Connection con =DBConnaction1.getDBConnection();
         
            String sql = "INSERT INTO emp VALUES (?, ?, ?, ?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 101);
            ps.setString(2, "Rahul");
            ps.setString(3, "IT");
            ps.setInt(4, 65000);
          
            ps.setString(5, "Agra");
            
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully!");
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
    }


}
