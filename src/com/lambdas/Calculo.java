package com.lambdas;

// Notação de Functional Interface, não permite ter mais de um método
@FunctionalInterface
public interface Calculo {
    public double calcular(double x, double y);

    // métodos default estão disponíveis para uso em lambdas
    default String coroi() {
        return "Coroi";
    }

}
