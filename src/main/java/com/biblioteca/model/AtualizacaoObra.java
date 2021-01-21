package com.biblioteca.model;

import com.biblioteca.model.Status;
import com.biblioteca.model.Usuario;

import java.time.LocalDate;

public class AtualizacaoObra {
    private Status status;
    private Usuario usuario;
    private LocalDate localDate;

    public Status getStatus() {
        return status;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public AtualizacaoObra(Status status, Usuario usuario) {
        this.status = status;
        this.usuario = usuario;
        this.localDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Atualizacao da Obra {" +
                "\n- status: " + status + ",\n- usuario:" + usuario + "\n- data:" + localDate +
                "\n}";
    }
}
