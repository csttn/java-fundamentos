package com.erros.excecoesnaochecadas;

public class NotaInvalidaException extends RuntimeException {

    private double numero;

    public NotaInvalidaException(Double numero) {
        this.numero = numero;
    }

    public String getMessage() {
        return "O número " + numero + " é negativo!";
    }

}
