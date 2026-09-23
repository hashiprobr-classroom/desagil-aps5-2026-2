package br.edu.insper.desagil.pi.catz;

public class Checkup extends Procedimento {
    public Checkup(Cliente cliente, String descricao) {
        super(cliente, descricao);
    }

    @Override
    public double preco() {
        return 275.00;
    }

    @Override
    public double desconto() {
        return 0.05;
    }
}
