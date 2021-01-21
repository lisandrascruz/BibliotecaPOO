package com.biblioteca.model;

import com.biblioteca.exceptions.DevolucaoObraException;
import com.biblioteca.exceptions.ObraIndisponivelException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private Endereco endereco;
    private List<AtualizacaoUsuario> historico;

    public Usuario(String nome, String sobrenome, LocalDate dataNascimento, Endereco endereco) {
        super(nome, sobrenome, dataNascimento);
        this.endereco = endereco;
        this.historico = new ArrayList<>();
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public List<AtualizacaoUsuario> getHistorico() {
        return historico;
    }

    public void atualizarHistorico(Status status, Obra obra){
        this.historico.add(new AtualizacaoUsuario(status, obra));
    }


}
