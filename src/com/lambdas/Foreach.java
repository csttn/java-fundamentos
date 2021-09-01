package com.lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "BIA", "LIA", "GUI");
        aprovados.forEach(nome -> System.out.println("Aprovado: " + nome));

        System.out.println("\nMethod reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\n uso Comum do método");
        aprovados.forEach(nome -> meuNome(nome));

        System.out.println("\nMethod reference com método");
        aprovados.forEach(Foreach::meuNome);
    }

    static void meuNome(String nome) {
        System.out.println("Meu nome é " + nome);
    }

}
