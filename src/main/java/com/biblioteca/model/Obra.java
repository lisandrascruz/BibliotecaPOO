package com.biblioteca.model;

import com.biblioteca.exceptions.DevolucaoObraException;
import com.biblioteca.exceptions.ObraIndisponivelException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Obra {
    private String nomeObra;
    private String tipoObra;
    private String lingua;
    private String tipoMidia;
    private List<Pessoa> autores;
    private List<String> editoras;
    private List<AtualizacaoObra> historico;

    public Obra(String nomeObra, String tipoObra, String lingua, String tipoMidia, List<Pessoa> autores, List<String> editoras) {
        this.nomeObra = nomeObra;
        this.tipoObra = tipoObra;
        this.lingua = lingua;
        this.tipoMidia = tipoMidia;
        this.autores = autores;
        this.editoras = editoras;
        this.historico = new ArrayList<>();
    }

    public String getNomeObra() {
        return nomeObra;
    }
    public String getTipoObra() {
        return tipoObra;
    }
    public String getLingua() {
        return lingua;
    }
    public String getTipoMidia() {
        return tipoMidia;
    }
    public List<Pessoa> getAutores() {
        return autores;
    }
    public List<String> getEditoras() {
        return editoras;
    }
    public List<AtualizacaoObra> getHistorico() {
        return historico;
    }

    public boolean estaDisponivel() {
        return historico.size() == 0 || Status.DEVOLVIDO.equals(historico.get(historico.size()-1).getStatus());
    }

    public boolean estaComUsuario(Usuario usuario) {
        return historico.size() != 0 && usuario.equals(historico.get(historico.size()-1).getUsuario());
    }

    public void atualizarHistorico(Status status, Usuario usuario){
        AtualizacaoObra atualizacaoObra = new AtualizacaoObra(status, usuario);
        historico.add(atualizacaoObra);
    }

    @Override
    public String toString() {
        return "{"+nomeObra+"}";
    }
}
