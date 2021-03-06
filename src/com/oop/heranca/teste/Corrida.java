package com.oop.heranca.teste;

import com.oop.heranca.desafio.Ferrari;
import com.oop.heranca.desafio.Fusca;

public class Corrida {

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Fusca fusca = new Fusca();

        for (int i = 0; i < 10; i++) {

            ferrari.acelerar();
            ferrari.ligarTurbo();
            fusca.acelerar();
            System.out.println("Ferrari: " + ferrari.getVelocidadeAtual());
            System.out.println("Fusca: " + fusca.getVelocidadeAtual());

        }

        for (int i = 0; i < 10; i++) {
            ferrari.desligarTurbo();
            ferrari.frear();
            fusca.frear();
            System.out.println("Ferrari: " + ferrari.getVelocidadeAtual());
            System.out.println("Fusca: " + fusca.getVelocidadeAtual());
        }

    }
}
