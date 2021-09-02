package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 7.8, false);
        Aluno aluno2 = new Aluno("Maria", 7.8, false);
        Aluno aluno3 = new Aluno("Eva", 4.8, true);
        Aluno aluno4 = new Aluno("Cris", 9.8, true);
        Aluno aluno5 = new Aluno("Pedro", 7.8, true);
        Aluno aluno6 = new Aluno("Jef", 7.8, false);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        Comparator<Aluno> comparator = (a1, a2) -> {
            if (a1.nota > a2.nota)
                return 1;
            if (a1.nota < a2.nota)
                return -1;
            return 0;
        };

        alunos.stream().max(comparator)
                .ifPresent(e -> System.out.println("Aluno com a maior nota: " + e.nome + " - " + e.nota));

        alunos.stream().min(comparator)
                .ifPresent(e -> System.out.println("Aluno com a menor nota: " + e.nome + " - " + e.nota));
    }
}
