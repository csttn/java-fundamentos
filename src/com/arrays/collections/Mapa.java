package com.arrays.collections;

import com.classe.exercicios.Usuario;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapa {

    public static void main(String[] args) {


        Map<Integer, Usuario> usuarios = new HashMap<Integer, Usuario>();

        Usuario u1 = new Usuario("nome", "email");
        Usuario u2 = new Usuario("nomee", "emaillll");
        Usuario u3 = new Usuario("nomeee", "emaillllç");

        for (int i = 0; i < 60; i++){
            Usuario user = new Usuario("nome" + i, "email"+ i);
            usuarios.put(i,user);

        }


        System.out.println(usuarios.size());

        System.out.println(usuarios.containsValue(u1));
        System.out.println(usuarios.containsValue(new Usuario("OtherName", "otherEmail")));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(Usuario valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Entry<Integer, Usuario> usuarioCompleto: usuarios.entrySet()){
            System.out.print(usuarioCompleto.getKey() + " ==> ");
            System.out.println(usuarioCompleto.getValue());
        }










    }
}
