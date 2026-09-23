package br.edu.insper.desagil.pi.cleiton;

import java.util.Map;

public class Projeto {
    private Map<String, Ferramenta> ferramentas;

    public Projeto(Map<String, Ferramenta> ferramentas) {
        this.ferramentas = ferramentas;
    }

    public double calculaTotal() {
        double total = 0;
        for (Ferramenta ferramenta : ferramentas.values()) {
            double preco = ferramenta.calculaPreco();
            if (preco >= 100 || !ferramenta.getUsuario().isPremium()) {
                total += preco;
            }
        }
        return total;
    }
}
