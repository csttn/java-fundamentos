package com.erros.excecoesnaochecadas;

import com.streams.Aluno;

public class Validar {

    private Validar() {
    }

    public static void aluno(Aluno aluno) {

        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo");
        }

        if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
            throw new StringVaziaException("O nome do aluno está nulo ou vazio");
        }

        if (aluno.getNota() < 0 || aluno.getNota() > 10) {
            throw new NotaInvalidaException(aluno.getNota());
        }
    }

}
