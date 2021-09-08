package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement statement = conexao.createStatement();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoa (" +
				"codigo INT AUTO_INCREMENT PRIMARY KEY,"+
				"nome VARCHAR(80) NOT NULL)";
				
		statement.execute(sql);
		
		System.out.println("Consulta feita com sucesso!");
		
		conexao.close();
		
	}

}
