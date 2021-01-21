package com.biblioteca.model;

import java.time.LocalDate;

public class AtualizacaoUsuario {
    private Status status;
    private Obra obra;
    private LocalDate localDate;

    public Status getStatusAtualizacao() {
        return status;
    }
    public Obra getObra() {
        return obra;
    }

    public AtualizacaoUsuario(Status status, Obra obra) {
        this.status = status;
        this.obra = obra;
        this.localDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Atualização Usuario {" +
                "\n- status: " + status + ",\n- obra:" + obra + "\n- data:" + localDate +
                "\n}";
    }

}
