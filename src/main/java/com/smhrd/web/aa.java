package com.smhrd.web;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Connection conn = DriverManager.getConnection("jdbc:mysql://project-db-stu.ddns.net:3307/fish?serverTimezone=UTC", 
					"fish","12345");
			System.out.println("success");
			Statement stmt = conn.createStatement();

		} catch (SQLException ex) {
			System.out.println("SQLException" + ex);
		}
		
		
		
	}

}
