package com.oop.heranca.desafio;

class Carro {

    private final int VELOCIDADE_MAXIMA;
    private double velocidadeAtual = 0;
    private int delta = 5;

    protected Carro(int velocidadeMaxima, int delta) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
        this.delta = delta;
    }

    protected int getDelta() {
        return delta;
    }

    protected int getVELOCIDADE_MAXIMA() {
        return VELOCIDADE_MAXIMA;
    }

    protected double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    protected void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    protected void frear() {
        if (velocidadeAtual - delta > 0) {
            velocidadeAtual -= delta;
        } else {
            velocidadeAtual = 0;
        }
    }
}
