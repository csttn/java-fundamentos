package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("Mercedes ", "BMW ", "Fiat ", "Ford ", "Honda ", "Toyota ");

        marcas.stream().map(e -> e.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = e -> e.toUpperCase();
        UnaryOperator<String> firstLetter = e -> e.charAt(0) + "";
        UnaryOperator<String> strong = e -> e + "!!!";

        marcas.stream().map(maiuscula).map(firstLetter).map(strong).forEach(print);

    }

}
