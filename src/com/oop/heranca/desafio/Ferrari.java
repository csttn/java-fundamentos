package com.oop.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

    private static double turbo = 30;
    private static int delta = 20;
    private static int velocidadeMaxima = 400;

    public Ferrari() {
        super(velocidadeMaxima, delta);
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

    @Override
    public void ligarTurbo() {
        if (getVelocidadeAtual() < getDelta() + turbo) {
            super.setDelta(delta + turbo);
        }
    }

    @Override
    public void desligarTurbo() {
        super.setDelta(delta);
    }

}
