package com.in.Mobile;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.in.Connection.DBConnaction1;

public class DeleteMobile {
	
	public static void main(String[] args) {
        try {
        	 Connection con =DBConnaction1.getDBConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM mobile WHERE id = ?");
            ps.setInt(1, 101);
            
            ps.executeUpdate();
            System.out.println("Data Deleted Successfully!");
            con.close();
        } catch (Exception e)
        {
        	e.printStackTrace(); }
    }

}
