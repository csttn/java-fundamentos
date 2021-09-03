package com.erros.personalizado;

public class StringVaziaException extends RuntimeException {

    private String string;

    public StringVaziaException(String string) {
        this.string = string;
    }

    public String getMessage() {
        return string;
    }

}
