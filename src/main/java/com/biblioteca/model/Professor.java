package com.biblioteca.model;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Funcionario{
    public Professor(String nome, String sobrenome, LocalDate dataNascimento, Endereco endereco, List<Departamento> departamentos) {
        super(nome, sobrenome, dataNascimento, endereco, departamentos);
    }

}
