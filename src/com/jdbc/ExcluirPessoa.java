package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.entity.Pessoa;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		Pessoa pesssoa = BuscarPessoa.buscarPessoaNoBancoPorId(entrada);

		System.out.println(pesssoa.getNome());

		exluirPessoaNoBanco(pesssoa); 

	}

	public static void exluirPessoaNoBanco(Pessoa pessoa) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();

//		para evitar isso, é necessario usar o preparedStatament
		String sql = "DELETE FROM pessoa WHERE codigo=?";

		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		preparedStatement.setInt(1, pessoa.getCodigo());
		int countlines = preparedStatement.executeUpdate();

		System.out.println("Pessoa Exluida com sucesso! "+" linhas afetadas: "+ countlines );

		conexao.close();
		preparedStatement.close();

	}

}
