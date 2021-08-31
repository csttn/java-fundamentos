package com.oop.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Cleyton");

        Produto caneta = new Produto("caneta",1 );
        Produto caderno = new Produto("caderno",1 );
        Produto album = new Produto("albuum",1 );

        Compra carrinho = new Compra();

        carrinho.items.add(new Item(caneta,1));
        carrinho.items.add(new Item(caderno, 1));
        carrinho.items.add(new Item(album, 1));

        cliente.comprar(carrinho);

        Compra carrinho2 = new Compra();
        carrinho2.items.add(new Item(caneta,2));
        carrinho2.items.add(new Item(caderno, 2));
        carrinho2.items.add(new Item(album, 2));


        cliente.comprar(carrinho2);

        for (Compra compra : cliente.compras){
            for(Item itemCompra : compra.items){
                System.out.println(itemCompra.produto.nome);
                System.out.println(itemCompra.produto.preco);
            }
        }

        System.out.println(cliente.nome + " - "+ cliente.obterValorTotalDaCompra());

    }
}
