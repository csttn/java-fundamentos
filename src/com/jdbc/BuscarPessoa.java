package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbc.entity.Pessoa;

public class BuscarPessoa {


	public static List<Pessoa> buscarPessoaNobancoPorNome() throws SQLException {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informa o nome da pessoa: ");

		String nome = entrada.next(); 
		Connection conexao = FabricaConexao.getConexao();

		String sql = "SELECT * FROM pessoa WHERE nome LIKE ?";

		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		preparedStatement.setString(1, "%" + nome + "%"); 

//		O executeQuery retorna um resultSet
//		o Execute não retorna resultSet
		preparedStatement.executeQuery();

		ResultSet resultet = preparedStatement.getResultSet();

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultet.next()) {

			int cod = resultet.getInt("codigo");
			String nomeDoUsuario = resultet.getString("nome");

			pessoas.add(new Pessoa(cod, nomeDoUsuario));

		}
		preparedStatement.close();
		conexao.close();
		entrada.close();
		return null;

	}

	public static Pessoa buscarPessoaNoBancoPorId(Scanner entrada) throws SQLException {

		System.out.println("Informa o codigo da pessoa que deseja buscar: ");

		String codigo = entrada.next();
		Connection conexao = FabricaConexao.getConexao();

		String sql = "SELECT * FROM pessoa WHERE codigo=?";

		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		preparedStatement.setString(1, codigo);

//		O executeQuery retorna um resultSet 
//		o Execute não retorna resultSet
		preparedStatement.executeQuery();

		ResultSet resulset = preparedStatement.getResultSet();

		if (resulset.next()) {

			int cod = resulset.getInt("codigo");
			String nomeDoUsuario = resulset.getString("nome");

			Pessoa pessoa = new Pessoa(cod, nomeDoUsuario);

			preparedStatement.close();
			conexao.close();

			return pessoa;

		}
		System.out.println("Não foi possivel encontarr :/");
		return null;

	}
}
