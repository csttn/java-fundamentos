package com.oop.heranca.desafio;

public class Carro {

    double velocidadeAtual = 0;


    void acelerar(){
        velocidadeAtual += 5;
    }


    void frear(){
        if( velocidadeAtual > 0){
            velocidadeAtual -= 5;
        }
    }
}
