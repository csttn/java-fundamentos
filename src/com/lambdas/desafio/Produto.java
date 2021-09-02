package com.lambdas.desafio;

import java.util.Objects;

public class Produto {

    private String nome;
    private double preco;
    private double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public Produto() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && preco == produto.preco && desconto == produto.desconto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, desconto);
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", preco='" + getPreco() + "'" + ", desconto='" + getDesconto() + "'"
                + "}";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
