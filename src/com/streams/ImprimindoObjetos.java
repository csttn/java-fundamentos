package com.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        // Criando um array de objetos
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Carlos", "Daniel", "Eduardo");

        // Imprimindo os objetos do array
        aprovados.forEach(System.out::println);

        System.out.println("--------------- Usando Iterator");

        // usando Itarator
        Iterator<String> it = aprovados.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------- Usando Stream");

        Stream<String> stream = aprovados.stream();
        stream.forEach(e -> System.out.println(e));
    }

}
