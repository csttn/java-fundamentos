package com.arrays.collections;

import com.classe.exercicios.Usuario;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana", "anaemail");
        Usuario u2 = new Usuario("Ana1", "anaemail2");
        Usuario u3 = new Usuario("An2", "anaemail3");

        lista.add(u1);
        lista.add(u2);
        lista.add(u3);

        for (Usuario u : lista) {
            System.out.println(u.nome);

        }
    }

}
