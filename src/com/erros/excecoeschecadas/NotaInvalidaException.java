package com.erros.excecoeschecadas;

public class NotaInvalidaException extends Exception {

    private double numero;

    public NotaInvalidaException(Double numero) {
        this.numero = numero;
    }

    public String getMessage() {
        return "O número " + numero + " é negativo!";
    }

}
