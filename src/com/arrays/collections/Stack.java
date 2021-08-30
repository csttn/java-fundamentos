package com.arrays.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("l1");
        livros.push("Dom queixote");
        livros.push("O hobbit");

//        o primero a entrar é o ultimo a sair
//        retornando o elemento que entrou por ultimo na pilha ( não remove)
        System.out.println(livros.peek());
        System.out.println(livros.peek());

        System.out.println(livros.poll());
        System.out.println(livros.poll());

    }

}
