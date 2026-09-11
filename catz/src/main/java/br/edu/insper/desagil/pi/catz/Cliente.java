package br.edu.insper.desagil.pi.catz;

import java.time.LocalDate;

public class Cliente {
    private String cpf;
    private String nome;
    private String nomeGato;
    private LocalDate nascimentoGato;
    private boolean fiel;

    public Cliente(String cpf, String nome, String nomeGato, LocalDate nascimentoGato, boolean fiel) {
        this.cpf = cpf;
        this.nome = nome;
        this.nomeGato = nomeGato;
        this.nascimentoGato = nascimentoGato;
        this.fiel = fiel;
    }

    public boolean isFiel() {
        return fiel;
    }

    public void troca() {
        fiel = !fiel;
    }

    public String resume() {
        String r = "";
        r += nomeGato + ", nascido em " + nascimentoGato;
        r += " (" + nome + " - " + cpf + ")";
        return r;
    }
}
