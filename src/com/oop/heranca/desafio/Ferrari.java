package com.oop.heranca.desafio;

public class Ferrari extends Carro {

    public Ferrari() {
        super(400);
        super.delta = 300;
    }


    public void acelerar(){
        super.acelerar();
    }
    public void frear(){
        super.frear();
    }


}
