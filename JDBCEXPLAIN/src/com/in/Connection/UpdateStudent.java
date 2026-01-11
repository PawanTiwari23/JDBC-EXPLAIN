package com.in.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;



public class UpdateStudent {
	public static void main(String[] args) {
		Connection con = null;
		try {
			 con =DBConnaction1.getDBConnection();
			if (con != null) {
				String sql = "UPDATE test SET  course = ? WHERE id = ?";
				PreparedStatement pstmt = con.prepareStatement(sql);

			
				pstmt.setString(1, "Doc"); // Updated Course
			

				pstmt.setInt(2, 101); 

				// Query execute karein
				int result = pstmt.executeUpdate();

				if (result > 0) {
					System.out.println("Data Updated successfully for ID: 11");
				} else {
					System.out.println("ID 11 not found in database.");
				}
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
