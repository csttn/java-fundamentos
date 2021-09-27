package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.entity.Pessoa;

public class PessoaDAO {

	private Connection conection;

	public void salvar(Pessoa pessoa) throws SQLException {

		conection = getConnection();

//		SQL INJECTION
//		O usuario pode inseriri comando sql diretamento no lugar do atributo "Nome"

		String sqlInjection = "INSERT INTO pessoa (nome) VALUES ('" + pessoa.getNome() + "')";

//		para evitar isso, é necessario usar o preparedStatament
		String sql = "INSERT INTO pessoa (nome) VALUES (?)";

		PreparedStatement preparedStatement = conection.prepareStatement(sql);

		preparedStatement.setString(1, pessoa.getNome());
		preparedStatement.execute();

		System.out.println("Pessoa incluida com sucesso");

		preparedStatement.close();
		conection.close();

	}

	public void editar(Pessoa pessoa) throws SQLException {

//		para evitar isso, é necessario usar o preparedStatament
		String sql = "UPDATE pessoa set nome=? WHERE codigo=?";

		PreparedStatement preparedStatement = conection.prepareStatement(sql);

		preparedStatement.setString(1, pessoa.getNome());
		preparedStatement.setInt(2, pessoa.getCodigo());
		preparedStatement.executeUpdate();

		System.out.println("Pessoa Alterada com sucesso!");

		conection.close();
		preparedStatement.close();

	}

	public void consultar(Pessoa pessoa) throws SQLException {
		String sql = "SELECT * FROM pessoa WHERE nome LIKE ?";

		PreparedStatement preparedStatement = conection.prepareStatement(sql);

		preparedStatement.setString(1, "%" + pessoa.getNome() + "%");

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
		conection.close();
	}

	public Pessoa consultarPorId(Pessoa pessoa ) throws SQLException {
		
		String sql = "SELECT * FROM pessoa WHERE codigo=?";

		PreparedStatement preparedStatement = conection.prepareStatement(sql);

		preparedStatement.setInt(1,pessoa.getCodigo());

//		O executeQuery retorna um resultSet 
//		o Execute não retorna resultSet
		preparedStatement.executeQuery();

		ResultSet resulset = preparedStatement.getResultSet();
		
		Pessoa usuario = new Pessoa();

		if (resulset.next()) {

			int cod = resulset.getInt("codigo");
			String nomeDoUsuario = resulset.getString("nome");
			
			usuario = new Pessoa(cod, nomeDoUsuario);

			preparedStatement.close();
			conection.close();

			return usuario;

		}
		System.out.println("Não foi possivel encontarr :/");
		return usuario;
	}

	private Connection getConnection() {

		try {
			if (conection != null && !conection.isClosed()) {

				return conection;
			}
		} catch (SQLException e) {

		}

		conection = FabricaConexao.getConexao();
		return conection;
	}

}
