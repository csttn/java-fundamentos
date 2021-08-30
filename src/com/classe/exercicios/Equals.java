package com.classe.exercicios;

public class Equals {


    public static void main(String[] args) {

        Usuario u1 = new Usuario();

        u1.mail= "mail";
        u1.nome = "name";

        Usuario u2 = new Usuario();

        u2.mail= "mail";
        u2.nome = "name";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        System.out.println(u1.hashCode() == u2.hashCode());

    }
}
