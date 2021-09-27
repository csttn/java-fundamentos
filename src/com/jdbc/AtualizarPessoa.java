package com.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.entity.Pessoa;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		Pessoa pessoa = BuscarPessoa.buscarPessoaNoBancoPorId(entrada);
		
		if(pessoa != null) { 
			System.out.println(pessoa.getNome());
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.next();
			
			pessoa.setNome(novoNome);
			
			NovaPessoa.atualizarPessoaNobanco(pessoa);
			
			entrada.close();
		}else {
			entrada.close();
		}
		
		entrada.close();
		
	}

}
