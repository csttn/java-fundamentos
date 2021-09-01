package com.oop.heranca.desafio;

public class Ferrari extends Carro {

    public Ferrari() {
        super(400, 40);
    }

    public void acelerar() {
        super.acelerar();
    }

    public void frear() {
        super.frear();
    }

    public double getVelocidadeAtual() {
        return super.getVelocidadeAtual();
    }

}
