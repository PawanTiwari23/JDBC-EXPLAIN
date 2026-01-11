package com.in.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertStudenr {
	public static void main(String[] args) {
        try {
        	 Connection con =DBConnaction1.getDBConnection();
         
            String sql = "INSERT INTO test VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 101);
            ps.setString(2, "Rahul");
            ps.setString(3, "MCA");
          
            ps.setString(4, "9785698563");
            
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully!");
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

}
