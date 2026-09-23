package br.edu.insper.desagil.pi.catz;

import java.time.LocalDate;

public class Cliente {
    private String cpf;
    private String nome;
    private Gato gato;
    private boolean fiel;

    public Cliente(String cpf, String nome, Gato gato, boolean fiel) {
        this.cpf = cpf;
        this.nome = nome;
        this.gato = gato;
        this.fiel = fiel;
    }

    @Deprecated
    public Cliente(String cpf, String nome, String nomeGato, LocalDate nascimentoGato, boolean fiel) {
        this.cpf = cpf;
        this.nome = nome;
        this.gato = new Gato(nomeGato, nascimentoGato);
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
        r += gato.resume();
        r += " (" + nome + " - " + cpf + ")";
        return r;
    }
}
