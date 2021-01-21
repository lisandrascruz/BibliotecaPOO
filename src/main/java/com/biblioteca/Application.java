package com.biblioteca;

import com.biblioteca.exceptions.DevolucaoObraException;
import com.biblioteca.exceptions.ObraIndisponivelException;
import com.biblioteca.model.*;
import com.biblioteca.model.Obra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {


    public static void main(String[] args) throws ObraIndisponivelException, DevolucaoObraException {
        Departamento computacao = new Departamento("Computação");
        Departamento saude = new Departamento("Saude");
        Departamento humanas = new Departamento("Humanas");

        List<Departamento> departamentosAna = new ArrayList<>();
        departamentosAna.add(computacao);
        departamentosAna.add(saude);

        List<Departamento> departamentosZe = new ArrayList<>();
        departamentosZe.add(humanas);

        Professor ana = new Professor ("Ana", "Luiza", LocalDate.parse("1994-07-30"),
                new Endereco("Rua Marco de Julho", 25, "Santo André", "10780-000",
                "13B", "Recife", "PE"), departamentosAna);

        Professor ze = new Professor ("Ana", "Luiza", LocalDate.parse("1974-02-01"),
                new Endereco("Rua Marco de Julho", 25, "Santo André", "50070-000",
                "14B", "Recife", "PE"), departamentosZe);

        Estudante pedro = new Estudante("Pedro", "Antonio", LocalDate.parse("1991-04-03"),
                new Endereco("Rua Julho", 2555, "Santo", "50788-000",
                "14B", "Recife", "PE"), "BSI");

        Estudante mariana = new Estudante("Mariana", "Verde", LocalDate.parse("2000-05-25"),
                new Endereco("Rua Julho", 2555, "Santo", "50788-000",
                "14B", "Recife", "PE"), "BSI");

        Obra domCasmurro = new Obra("Dom Casmurro", "Livro", "Português", "Física", Arrays.asList(ze), Arrays.asList("Moderna", "Demis sinonimo"));
        Obra primoBasilio = new Obra("Primo Basilio", "Livro", "Português", "Física", Arrays.asList(ze), Arrays.asList("Moderna", "Demis sinonimo"));
        Obra oCortico = new Obra("O Cortiço", "Livro", "Português", "Física", Arrays.asList(ze), Arrays.asList("Moderna", "Demis sinonimo"));

        com.biblioteca.model.Biblioteca.pegar(mariana, domCasmurro);
        com.biblioteca.model.Biblioteca.pegar(mariana, primoBasilio);
        com.biblioteca.model.Biblioteca.devolver(mariana, domCasmurro);

        System.out.println("Obra: "+domCasmurro.getNomeObra() + "\n" + domCasmurro.getHistorico()+"\n\n");
        System.out.println("Usuario: "+mariana.getNome() + "\n" + mariana.getHistorico()+"\n\n");

    }
}
