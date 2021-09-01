package com.oop.heranca.desafio;

// Classe abstrata permite que seja usada somente como base para outras classes
//  sendo assim, não pode ser instanciada, somente herdada
public abstract class Carro {

    // Atributos privados ficam visiveis apenas dentro da classe
    private final int VELOCIDADE_MAXIMA;
    private double velocidadeAtual = 0;
    private double delta = 5;

    // Atributos e métodos protegidos ficam visiveis dentro da classe e classes que
    // herdam
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
