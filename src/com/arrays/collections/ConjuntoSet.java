package com.arrays.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoSet {

    public static void main(String[] args) {

//        Lista tipada
        HashSet<String> lista = new HashSet<>();

        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");

        System.out.println(lista);

        TreeSet<String> lista2 = new TreeSet<>();

        lista2.add("2");
        lista2.add("1");
        lista2.add("3");
        lista2.add("4");

        System.out.println(lista2);




    }

}
