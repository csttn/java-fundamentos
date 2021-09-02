package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, String> intToBinary = (Integer i) -> Integer.toBinaryString(i);
        UnaryOperator<String> revertBinary = (String s) -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binaryStringToInt = (String s) -> Integer.parseInt(s, 2);

        numbers.stream().map(intToBinary).map(revertBinary).map(binaryStringToInt).forEach(System.out::println);

    }
}
