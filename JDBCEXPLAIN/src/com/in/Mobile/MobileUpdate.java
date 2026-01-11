package com.in.Mobile;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.in.Connection.DBConnaction1;

public class MobileUpdate {
	public static void main(String[] args) {
        try {
        	 Connection con =DBConnaction1.getDBConnection();
            String sql = "UPDATE mobile SET Brandname = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "APPLE");
            ps.setInt(2, 1);
            
            ps.executeUpdate();
            System.out.println("Data Updated Successfully!");
            con.close();
        } catch (Exception e) 
        { e.printStackTrace(); }
    }


}
