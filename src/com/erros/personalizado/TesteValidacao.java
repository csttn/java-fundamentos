package com.erros.personalizado;

import com.streams.Aluno;

public class TesteValidacao {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Teste", -7.9, false);
        Aluno aluno2 = null;
        Aluno aluno3 = new Aluno("", 8.9, false);

        try {
            Validar.aluno(aluno);
            Validar.aluno(aluno2);
            Validar.aluno(aluno3);
        } catch (StringVaziaException | NotaInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");

    }
}
