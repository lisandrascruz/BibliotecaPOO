package com.biblioteca.exceptions;

public class DevolucaoObraException extends Exception {
    private static final String MESSAGE = "Esta obra não pode ser devolvida. Verifique se ela foi emprestada ou se outro usuario esta com ela";

    public DevolucaoObraException() {
        super(MESSAGE);
    }
}
