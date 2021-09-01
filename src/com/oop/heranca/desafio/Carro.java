package com.oop.heranca.desafio;

public class Carro {

   protected final int VELOCIDADE_MAXIMA;

   public double velocidadeAtual = 0;

   protected int delta = 5;

    public Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    protected void acelerar(){

        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += delta;
        }

    }

    protected void frear(){
        if( velocidadeAtual - delta > 0){
            velocidadeAtual -= delta;
        } else {
            velocidadeAtual = 0;
        }
    }
}
