package br.edu.insper.desagil.pi.catz;

public class Procedimento {
    private Cliente cliente;
    private String descricao;

    public Procedimento(Cliente cliente, String descricao) {
        this.cliente = cliente;
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return descricao;
    }
}
