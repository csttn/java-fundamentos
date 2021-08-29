package com.arrays.exercicios;

import java.util.Arrays;

public class Foreach {


    public static void main(String[] args) {
        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++){
            notas[i] = Math.floor(Math.random() * 10);
        }

        for (var nota: notas) {
            System.out.println(nota);

        }



    }
}
