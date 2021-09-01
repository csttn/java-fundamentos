package com.fudamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();


        // String texto = """
        //       Nome:  %s
        //       Sobrenome: %s
        //       Idade: %s
        //        """.formatted(nome,sobrenome,idade);


        String texto = String.format("Nome: %s\nSobrenome: %s\nIdade: %s", nome, sobrenome, idade);

        System.out.println(texto);

        teclado.close();
    }
}
