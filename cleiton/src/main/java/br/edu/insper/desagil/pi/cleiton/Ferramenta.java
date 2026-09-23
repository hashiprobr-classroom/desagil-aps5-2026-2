package br.edu.insper.desagil.pi.cleiton;

public abstract class Ferramenta {
    private Usuario usuario;

    public Ferramenta(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public abstract void executa();

    public abstract double calculaPreco();
}
