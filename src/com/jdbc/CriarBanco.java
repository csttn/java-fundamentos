package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
	
		
		Connection conexao = FabricaConexao.getConexao();
		
		
		System.out.println("Conexão feita com sucesso");
		

		Statement statement = conexao.createStatement();
		
		statement.execute("CREATE DATABASE IF NOT EXISTS java_udemy");
		
		
		System.out.println("Banco criado com sucesso!");
		
		conexao.close();

	}

}
