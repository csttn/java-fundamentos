package com.fudamentos;

public class Inferencia {

    public static void main(String[] args) {

        var n = 4.7;
//        inferencia de tipo, o java setou o tipo da variavel de acordo com o valor atribuido a mesma.
        System.out.println(((Object)n).getClass().getSimpleName());
    }
}
