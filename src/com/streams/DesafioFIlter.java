package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DesafioFIlter {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 7.8, false);
        Aluno aluno2 = new Aluno("Maria", 3.8, false);
        Aluno aluno3 = new Aluno("Eva", 8.8, true);
        Aluno aluno4 = new Aluno("Cris", 9.8, true);
        Aluno aluno5 = new Aluno("Pedro", 5.8, true);
        Aluno aluno6 = new Aluno("Jef", 6.8, false);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        Consumer<Aluno> imprimir = aluno -> System.out.println(aluno.nome);

        Predicate<Aluno> alunoAprovado = aluno -> aluno.nota >= 7.0;
        Predicate<Aluno> alunoComportado = aluno -> aluno.comportamento;
        Predicate<Aluno> alunoRecuperacao = aluno -> aluno.nota >= 5.0 && aluno.nota < 7.0 && aluno.comportamento;

        Predicate<Aluno> alunoReprovado = aluno -> aluno.nota < 7.0 && !aluno.comportamento;

        System.out.println("Aprovados --------------");
        alunos.stream().filter(alunoAprovado).filter(alunoComportado).forEach(imprimir);
        System.out.println("Reprovados ----------");
        alunos.stream().filter(alunoReprovado).forEach(imprimir);
        System.out.println("Recuperação -------------");
        alunos.stream().filter(alunoRecuperacao).forEach(imprimir);

    }
}
