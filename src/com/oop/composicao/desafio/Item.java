package com.oop.composicao.desafio;

import java.util.ArrayList;

public class Item {

    int quantidade = 0;
    final  Produto produto;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade  = quantidade;

    }

}
