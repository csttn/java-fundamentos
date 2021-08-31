package com.oop.composicao;

public class Carro {

    final int count = 0;


    Motor motor  = new Motor();


    void acelerar(){
        motor.fatorInjecao += 0.4;
    }

    void frear(){

        motor.fatorInjecao -= 0.4;
    }
}
