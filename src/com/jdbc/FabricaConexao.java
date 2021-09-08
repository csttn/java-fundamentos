package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	
	public static Connection getConexao(){
		
		try {
			String stringConexao = "jdbc:mysql://192.168.147.75:3306/java_udemy";
			String user = "root";
			String password = "mysqldatabase";
			
			return DriverManager.getConnection(stringConexao, user, password);
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}
}
