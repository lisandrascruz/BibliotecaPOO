package com.biblioteca.model;
import com.biblioteca.exceptions.DevolucaoObraException;
import com.biblioteca.exceptions.ObraIndisponivelException;

public class Biblioteca {

    public static void pegar(Usuario usuario, Obra obra) throws ObraIndisponivelException {
        if (obra.estaDisponivel()) {
            usuario.atualizarHistorico(Status.EMPRESTADO, obra);
            obra.atualizarHistorico(Status.EMPRESTADO, usuario);
        } else throw new ObraIndisponivelException();
    }

    public static void devolver(Usuario usuario, Obra obra) throws DevolucaoObraException, ObraIndisponivelException {
        if (obra.estaDisponivel()) {
            throw new DevolucaoObraException();
        }

        if(obra.estaComUsuario(usuario)) {
            usuario.atualizarHistorico(Status.DEVOLVIDO, obra);
            obra.atualizarHistorico(Status.DEVOLVIDO, usuario);
        } else throw new ObraIndisponivelException();
    }
}
