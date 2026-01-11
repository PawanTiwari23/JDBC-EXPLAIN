package com.in.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.in.Connection.DBConnaction1;

public class InsertBook {
	public static void main(String[] args) {
        try {
        	 Connection con =DBConnaction1.getDBConnection();
         
            String sql = "INSERT INTO book VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 101);
            ps.setString(2, "JAVA");
          
            ps.setInt(3, 65000);
          
         
            
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully!");
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

}
