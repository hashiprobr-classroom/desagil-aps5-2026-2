package br.edu.insper.desagil.pi.catz;

public class Tosa extends Procedimento {
    public Tosa(Cliente cliente, String descricao) {
        super(cliente, descricao);
    }

    @Override
    public double preco() {
        return 88.50;
    }

    @Override
    public double desconto() {
        return 0.1;
    }
}
