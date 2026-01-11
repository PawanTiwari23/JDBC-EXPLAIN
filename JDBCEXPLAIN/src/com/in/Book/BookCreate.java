package com.in.Book;

import java.sql.Connection;
import java.sql.Statement;

import com.in.Connection.DBConnaction1;

public class BookCreate {
	public static void main(String[] args) {
        try {
            Connection con =DBConnaction1.getDBConnection();
            Statement stmt = con.createStatement();

           
            String query = "CREATE TABLE IF NOT EXISTS book (id INT PRIMARY KEY, Bookname VARCHAR(50), price int)";
            
            stmt.execute(query);
            System.out.println("Table created or already exists.");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
