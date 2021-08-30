package com.classe.exercicios;

import java.util.Objects;

public class Usuario {


    public String nome;
    public String mail;

    public Usuario(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return Objects.equals(mail, usuario.mail);
    }


    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }
}
