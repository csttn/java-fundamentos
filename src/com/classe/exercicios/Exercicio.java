package com.classe.exercicios;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++){
            notas[i] = Math.floor(Math.random() * 10);
        }
        System.out.println(Arrays.toString(notas));
        System.out.println("Média " + Math.floor(Arrays.stream(notas).sum() / notas.length));



    }
}
