package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 7.8, false);
        Aluno aluno2 = new Aluno("Maria", 7.8, false);
        Aluno aluno3 = new Aluno("Eva", 4.8, true);
        Aluno aluno4 = new Aluno("Cris", 9.8, true);
        Aluno aluno5 = new Aluno("Pedro", 7.8, true);
        Aluno aluno6 = new Aluno("Jef", 7.8, false);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        Predicate<Aluno> alunoAprovado = aluno -> aluno.nota >= 7.0;

        // todos passaram ?
        System.out.println(alunos.stream().allMatch(alunoAprovado));
        // alguem passou ?
        System.out.println(alunos.stream().anyMatch(alunoAprovado));
        // todos reprovados ?
        System.out.println(alunos.stream().noneMatch(alunoAprovado));

    }

}
