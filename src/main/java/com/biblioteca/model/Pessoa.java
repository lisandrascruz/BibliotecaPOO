package com.biblioteca.model;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private int idade;

    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        calcularIdade(this.dataNascimento);
    }

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public int getIdade() {
        return idade;
    }

    private void calcularIdade(LocalDate dataNascimento){
        int diaAtual = LocalDate.now().getDayOfMonth();
        int mesAtual = LocalDate.now().getMonthValue();
        int anoAtual = LocalDate.now().getYear();

        if (mesAtual >= dataNascimento.getMonthValue() && diaAtual >= dataNascimento.getDayOfMonth()) {
            idade = anoAtual-dataNascimento.getYear();
        } else {
            idade = anoAtual-1-dataNascimento.getYear();
        }
    }
}
