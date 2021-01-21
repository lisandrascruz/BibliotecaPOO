package com.biblioteca.model;

import java.time.LocalDate;
import java.util.List;

public abstract class Funcionario extends Usuario {
    private List<Departamento> departamentos;

    public Funcionario(String nome, String sobrenome, LocalDate dataNascimento, Endereco endereco, List<Departamento> departamentos) {
        super(nome, sobrenome, dataNascimento, endereco);
        this.departamentos = departamentos;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
}
