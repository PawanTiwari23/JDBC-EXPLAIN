package com.in.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.in.Connection.DBConnaction1;

public class BookUpdate {
	public static void main(String[] args) {
        try {
        	 Connection con =DBConnaction1.getDBConnection();
            String sql = "UPDATE emp SET price = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 2563);
            ps.setInt(2, 1);
            
            ps.executeUpdate();
            System.out.println("Data Updated Successfully!");
            con.close();
        } catch (Exception e) 
        { e.printStackTrace(); }
    }

}
