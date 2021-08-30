package com.arrays.collections;

import java.util.HashSet;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ConjuntosMisturado {

    public static void main(String[] args) {


        HashSet conjunto = new HashSet();

        conjunto.add(1.3);
        conjunto.add("Teste");
        conjunto.add(true);

        System.out.println(conjunto.size());

// reptindo elementos
        conjunto.add("Teste");

        System.out.println(conjunto.size());

        conjunto.remove("Teste");
        conjunto.contains("Teste");
        conjunto.contains(true);


        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums);
        System.out.println(conjunto);
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();



    }


}
