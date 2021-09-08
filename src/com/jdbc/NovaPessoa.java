package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {

		
		Connection conexao = FabricaConexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa o nome da pessoa: ");
		
		String nome = entrada.next();
		
//		SQL INJECTION
//		O usuario pode inseriri comando sql diretamento no lugar do atributo "Nome"
		
		String sqlInjection = "INSERT INTO pessoa (nome) VALUES ('"+ nome +"')";
		
		
//		para evitar isso, é necessario usar o preparedStatament
		String sql = "INSERT INTO pessoa (nome) VALUES (?)";
		
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);
		
		preparedStatement.setString(1, nome);
		preparedStatement.execute();
		
		System.out.println("Pessoa incluida com sucesso");
		
		entrada.close();
	}

}
