package com.oop.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void comprar(Compra compra){
    compras.add(compra);
    }

    double obterValorTotalDaCompra(){
        double total = 0;
        for (Compra compra : compras){
            total += compra.obterValorDaCompra();
        }
        return total;
    }



}
