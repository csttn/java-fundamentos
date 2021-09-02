package com.streams;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);

        Aluno aluno1 = new Aluno("João", 7.8, false);
        Aluno aluno2 = new Aluno("Maria", 3.8, false);
        Aluno aluno3 = new Aluno("Eva", 8.8, true);
        Aluno aluno4 = new Aluno("Cris", 9.8, true);
        Aluno aluno5 = new Aluno("Pedro", 5.8, true);
        Aluno aluno6 = new Aluno("Jef", 6.8, false);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        alunos.stream().reduce((a, b) -> a.nota > b.nota && !a.comportamento ? a : b)
                .ifPresent(aluno -> System.out.println(aluno.nome + " Aluno com a mair nota entre os maus criados"));

    }

}
