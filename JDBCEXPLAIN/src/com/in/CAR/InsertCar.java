package com.in.CAR;

import java.sql.Connection;
import java.sql.Statement;

import com.in.Connection.DBConnaction1;

public class InsertCar {
	public static void main(String[] args) throws Exception {
		 Connection con =DBConnaction1.getDBConnection();
        
        
        String sql = "INSERT INTO car VALUES (1, 'Tata', 'AYT1235', '5896459', 'Black')";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        
        System.out.println("Student Added!");
        con.close();
    }

}
