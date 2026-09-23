package br.edu.insper.desagil.pi.cleiton;

import java.util.ArrayList;
import java.util.List;

public class Conversa extends Ferramenta {
    private List<Pedido> pedidos;

    public Conversa(Usuario criador) {
        super(criador);
        this.pedidos = new ArrayList<>();
    }

    public void adiciona(Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public void executa() {
        for (Pedido pedido : pedidos) {
            pedido.executa();
        }
    }

    @Override
    public double calculaPreco() {
        double preco = 0;
        for (Pedido pedido : pedidos) {
            preco += pedido.calculaPreco();
        }
        if (pedidos.size() > 1) {
            preco *= 0.95;
        }
        return preco;
    }
}
