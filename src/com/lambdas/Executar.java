package com.lambdas;

import java.util.function.BinaryOperator;

public class Executar {

    public static void main(String[] args) {

        Soma soma = new Soma();
        Multiplicar multiplicar = new Multiplicar();

        System.out.println(soma.calcular(1, 2) + " usando classe com método da interface implemntado");
        System.out.println(multiplicar.calcular(1, 2) + " usando classe com método da interface implemntado");

        // Usando Lambda
        Calculo calculo = (x, y) -> x + y;

        // As lamdas evitam a criação de outras classes implementando o método, como no
        // exemplo de soma e multiplicar

        System.out.println(calculo.calcular(7, 2) + " usando lambda com o mesmo tipo da interface");
        System.out.println(calculo.coroi() + " usando método default da inteface dentro da lambda");

        // Utilizando interfaces duncionais do próprio java
        BinaryOperator<Double> soma2 = (x, y) -> x + y;
        System.out.println(soma2.apply(8.0, 2.0) + " usando lambda com Interface Funcional do próprio JAVA");

    }
}
