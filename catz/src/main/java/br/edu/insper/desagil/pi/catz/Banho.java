package br.edu.insper.desagil.pi.catz;

public class Banho {
    private Cliente cliente;
    private String descricao;

    public Banho(Cliente cliente, String descricao) {
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
