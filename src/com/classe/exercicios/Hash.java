package com.classe.exercicios;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {


        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("name1", "email1"));
        usuarios.add(new Usuario("name2", "email2"));
        usuarios.add(new Usuario("name3", "email3"));


        System.out.println(usuarios.contains(new Usuario("name1", "email1")));
    }
}
