package br.edu.insper.desagil.pi.catz;

import java.time.LocalDate;

public class Gato {
    private String nome;
    private LocalDate nascimento;

    public Gato(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String resume() {
        return nome + ", nascido em " + nascimento;
    }
}
