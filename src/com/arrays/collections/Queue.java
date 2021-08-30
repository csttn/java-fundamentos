package com.arrays.collections;

import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        LinkedList fila = new LinkedList();

//        Caso ocorra um erro ao adicionar o elemento na lista um erro será lançado, se a mesma estiver cheia
        fila.add("Ana");

//        Caso ocorra um eror ao adicionar o elemento na fila offer ira retornar um boolean informando
//        true = adicionado, false = não adicionado
//        nao remove o elemnto da fila ao retornar
        fila.offer("Ana2");

//         retorma o primeiro elamento da fila, caso a fila esteja vazia o valor sera null
        fila.peek();
        //         retorma o primeiro elamento da fila, caso a fila esteja vazia lançara uma exceção

        fila.element();
        System.out.println(fila.size() + " " + fila.peek());

        fila.isEmpty();

//        Retona o primeiro elemento da fila removendo o mesmo.
        fila.poll();



    }
}
