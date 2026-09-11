package br.edu.insper.desagil.pi.catz;

public class Tosa {
    private Cliente cliente;
    private String descricao;

    public Tosa(Cliente cliente, String descricao) {
        this.cliente = cliente;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
