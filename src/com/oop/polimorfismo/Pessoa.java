package com.oop.polimorfismo;

public class Pessoa {

    // Definindo atributos privados e acessndo-os através de getters e setters
    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

    // Polimorfismo dinamico, aceita todos os tipos de objetos que herdam de Comida
    // Ex: Classe Arroz, Feijao, Frango, Carne, etc...
    public void comer(Comida comida) {
        setPeso(getPeso() + comida.getPeso());
    }

}
