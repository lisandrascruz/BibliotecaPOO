package com.biblioteca.model;

import java.time.LocalDate;

public class Estudante extends Usuario {
    private String curso;

    public String getCurso() {
        return curso;
    }

    public Estudante(String nome, String sobrenome, LocalDate dataNascimento, Endereco endereco, String curso) {
        super(nome, sobrenome, dataNascimento, endereco);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "{Estudante: " + getNome() + "}";
    }
}

