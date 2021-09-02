package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<String> imprimir = System.out::print;
        Stream<String> items = Stream.of("a", "b", "c", "d", "e\n");

        items.forEach(imprimir);

        String[] array = { "a", "b", "c", "d", "e\n" };
        // formas de criar um stream
        Stream.of(array).forEach(imprimir);
        Arrays.stream(array).forEach(imprimir);
        Arrays.stream(array, 1, 3).forEach(imprimir);
        System.out.println("\n");

        // criando um stream a partir de uma collection

        List<String> lista = Arrays.asList("b", "a", "d", "c", "e\n");
        lista.sort(Comparator.comparing(String::toString));
        lista.stream().forEach(imprimir);

        // Generate Stream
        Stream.generate(() -> Math.ceil(Math.random() * 10)).limit(10).forEach(System.out::println);
        // Generate Stream Itarator
        Stream.iterate(0, n -> n + 1).limit(10000).forEach(System.out::println);
    }
}
