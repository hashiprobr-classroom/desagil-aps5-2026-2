package br.edu.insper.desagil.pi.catz;

public class Banho extends Procedimento {
    public Banho(Cliente cliente, String descricao) {
        super(cliente, descricao);
    }

    @Override
    public double preco() {
        return 74.90;
    }

    @Override
    public double desconto() {
        return 0.15;
    }
}
