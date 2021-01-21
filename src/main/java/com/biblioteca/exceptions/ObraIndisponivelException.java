package com.biblioteca.exceptions;

public class ObraIndisponivelException extends Exception {
    private static final String MESSAGE = "Esta obra está indisponível";

    public ObraIndisponivelException() {
        super(MESSAGE);
    }
}
