package br.edu.insper.desagil.pi.cleiton;

public class Usuario {
    private String apelido;
    private String nome;
    private boolean premium;

    public Usuario(String apelido, String nome, boolean premium) {
        this.apelido = apelido;
        this.nome = nome;
        this.premium = premium;
    }

    public String getApelido() {
        return apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPremium() {
        return premium;
    }

    public void troca() {
        premium = !premium;
    }
}
