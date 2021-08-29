package com.fudamentos;

import java.util.Date;

public class ValorVsreferencia {

    public static void main(String[] args) {

        // Atribuição por valor
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a +" " + b);


        // atribuição por referência

        Date d1 = new Date();

        d1.setTime(1945717084);
        System.out.println(d1.getTime());

        // atribuindo referencia
        Date d2 = d1;

        System.out.println(d2.getTime());
        d2.setTime(10000000);
        System.out.println(d1.getTime());






    }
}
