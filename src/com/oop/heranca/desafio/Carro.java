package com.oop.heranca.desafio;

public abstract class Carro {

    private final int VELOCIDADE_MAXIMA;
    private double velocidadeAtual = 0;
    private double delta = 5;

    protected Carro(int velocidadeMaxima, int delta) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
        this.delta = delta;
    }

    protected double getDelta() {
        return delta;
    }

    protected int getVELOCIDADE_MAXIMA() {
        return VELOCIDADE_MAXIMA;
    }

    protected double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    protected void setDelta(double delta) {
        if (delta > 0) {
            this.delta = delta;
        }
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
