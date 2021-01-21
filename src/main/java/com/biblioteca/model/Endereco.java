package com.biblioteca.model;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String complemento;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String cep, String complemento, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }
    public int getNumero() {
        return numero;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }

}