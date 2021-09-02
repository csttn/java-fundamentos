package com.lambdas.desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {
        Produto produto = new Produto("TV", 900.00, 0.13);

        Function<Produto, Double> calcularPreco = (p) -> p.getPreco() - (p.getPreco() * p.getDesconto());

        Function<Double, Double> imposto = (valor) -> {
            if (valor > 2500) {
                return valor + (valor * 0.85);
            } else {
                return valor;
            }
        };

        UnaryOperator<Double> frete = (valor) -> {
            if (valor > 3000) {
                return valor + 100.0;
            } else {
                return valor + 50.0;
            }
        };

        UnaryOperator<Double> arredondar = (valor) -> Math.ceil(valor);

        Function<Double, String> formatar = (valor) -> String.format("R$ %.2f", valor);

        String result = calcularPreco.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar)
                .apply(produto);

        System.out.println(result);
    }

}
