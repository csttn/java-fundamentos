package com.oop.composicao.desafio;

public class Item {

    int quantidade = 0;
    final Produto produto;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

    }

}
