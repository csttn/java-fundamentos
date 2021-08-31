package com.oop.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private double total = 0;

   final List<Item> items = new ArrayList<>();

    double obterValorDaCompra(){
        for(Item item: items){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

    void adicionarItem(Produto p, int qtde){
        this.items.add(new Item(p, qtde));
    }


}
