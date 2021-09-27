package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.entity.Pessoa;

public class NovaPessoa { 
	
	
	public static void main(String[] args) throws SQLException {
		
		
		cadastrarNovaPessoaNoBanco(); 
	}

	
	public static void cadastrarNovaPessoaNoBanco() throws SQLException {

		
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
				
		preparedStatement.close();
		conexao.close();
		
		
	}

	
	public static void atualizarPessoaNobanco(Pessoa pessoa) throws SQLException {
	
		Connection conexao = FabricaConexao.getConexao();
			
		
//		para evitar isso, é necessario usar o preparedStatament
		String sql = "UPDATE pessoa set nome=? WHERE codigo=?";
		
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);
		
		preparedStatement.setString(1, pessoa.getNome());
		preparedStatement.setInt(2, pessoa.getCodigo());
		preparedStatement.executeUpdate();
		
		System.out.println("Pessoa Alterada com sucesso!");
		
		conexao.close();
		preparedStatement.close();
		
	}
}
