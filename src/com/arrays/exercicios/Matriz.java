package com.arrays.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos");
        int qtdDeAlunos = entrada.nextInt();

        System.out.println("Informe a quantidade de notas por aluno");
        int qtdDeNotasPorAluno  = entrada.nextInt();

        double[][] notas = new double[qtdDeAlunos][qtdDeNotasPorAluno];
        double media = 0;

        for (int aluno = 0; aluno < notas.length; aluno++){
            System.out.println("Aluno: "+ (aluno+1));

            for (int nota = 0; nota < notas[aluno].length; nota++ ){
                System.out.println("Informe a nota "+ (nota+1) +" do aluno "+ (aluno+1) );
                notas[aluno][nota] = entrada.nextDouble();
                media += notas[aluno][nota];
            }
        }

        System.out.println("A media da turma é: "+ Math.floor(media / (qtdDeAlunos * qtdDeNotasPorAluno)));

        entrada.close();
    }
}
