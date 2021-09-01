package com.oop.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidade = new Pessoa(70);

        Arroz arroz = new Arroz(2.5);
        Feijao feijao = new Feijao(1.5);
        Sorvete sorvete = new Sorvete(3.5);

        convidade.comer(arroz);
        convidade.comer(feijao);
        convidade.comer(sorvete);

        System.err.println(convidade.getPeso());
        System.out.println(arroz.getPeso());

    }
}
