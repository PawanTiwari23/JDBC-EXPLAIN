package com.in.Mobile;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.in.Connection.DBConnaction1;

public class MobileInsert {
	public static void main(String[] args) {
        try {
        	 Connection con =DBConnaction1.getDBConnection();
         
            String sql = "INSERT INTO mobile VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 101);
            ps.setString(2, "VIVO");
         
            ps.setInt(3, 65000);
          
            ps.setString(4, "8 GB");
            
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully!");
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
