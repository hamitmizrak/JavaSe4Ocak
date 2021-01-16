package com.ecodation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	
	private static Connection connection;
	private static String url="jdbc:mysql://localhost:3306/hastane_otomasyonu";
	private static String user="root";
	private static String password="root";
	
	
	public static  Connection dbConnectivy() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver başarılı bir şekilde yüklendi");
			connection=DriverManager.getConnection(url, user, password);
			System.out.println("database bağlantısı başarılı.");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}
	
	/*
	public static void main(String[] args) {
		dbConnectivy();
	}
	*/
	
}
