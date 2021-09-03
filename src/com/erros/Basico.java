package com.erros;

import com.streams.Aluno;

public class Basico {

    public static void main(String[] args) {

        Aluno aluno = null;

        // Erro 1
        try {
            imprimirAluno(aluno);
        } catch (NullPointerException e) {
            System.out.println("Ocorreu um erro no aluno");
        }

        // Erro 2
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("Fim :)");

    }

    public static void imprimirAluno(Aluno aluno) {

        System.out.println(aluno.getNome());
    }
}
