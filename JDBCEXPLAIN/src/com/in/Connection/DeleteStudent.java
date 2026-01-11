package com.in.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStudent {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/pawan";
        String user = "postgres";
        String pass = "root";
        
        try {
           
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student ID to delete: ");
            int idToDelete = sc.nextInt(); 
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            // SQL Query: 
            String sql = "DELETE FROM students WHERE id = ?";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
          
            pstmt.setInt(1, idToDelete);
            
           
            int rowsAffected = pstmt.executeUpdate();
            
            if(rowsAffected > 0) {
                System.out.println("Success! Student (ID: " + idToDelete + ") delete ho gaya.");
            } else {
                System.out.println("Ye ID database mein nahi mili.");
            }
            
            conn.close();
            sc.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
