package com.erros.excecoeschecadas;

public class StringVaziaException extends Exception {

    private String string;

    public StringVaziaException(String string) {
        this.string = string;
    }

    public String getMessage() {
        return string;
    }

}
