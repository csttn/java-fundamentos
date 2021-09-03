package com.streams;

public class Aluno {

    final String nome;
    final double nota;
    final boolean comportamento;

    public Aluno(String nome, double nota, boolean comportamento) {
        this.nome = nome;
        this.nota = nota;
        this.comportamento = comportamento;
    }

    public String getNome() {
        return this.nome;
    }

    public double getNota() {
        return this.nota;
    }

    public boolean isComportamento() {
        return this.comportamento;
    }

    public boolean getComportamento() {
        return this.comportamento;
    }

}
