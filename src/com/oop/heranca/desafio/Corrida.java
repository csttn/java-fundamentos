package com.oop.heranca.desafio;

public class Corrida {


    public static void main(String[] args) {


        Ferrari ferrari = new Ferrari();
        Fusca fusca = new Fusca();

        for (int i = 0; i < 10; i ++ ){
            ferrari.acelerar();
            fusca.acelerar();
        }

        System.out.println("Ferrari: "+ferrari.velocidadeAtual);
        System.out.println("Fusca: "+fusca.velocidadeAtual);

        for (int i = 0; i < 10; i ++ ){
            ferrari.frear();
            fusca.frear();
        }

        System.out.println("Ferrari: "+ferrari.velocidadeAtual);
        System.out.println("Fusca: "+fusca.velocidadeAtual);

    }
}
