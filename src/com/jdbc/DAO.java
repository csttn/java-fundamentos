package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class DAO {
	
	private Connection conection;
	
	private Connection getConnection() {
		
		try {
			if(conection != null && !conection.isClosed()) {
				
				return conection;
			}
		} catch (SQLException e) {
			
		}
		
		conection = FabricaConexao.getConexao();
		return conection;
	}

}
