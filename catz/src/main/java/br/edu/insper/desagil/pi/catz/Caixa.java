package br.edu.insper.desagil.pi.catz;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private List<Procedimento> procedimentos;

    public Caixa() {
        this.procedimentos = new ArrayList<>();
    }

    public void adiciona(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    @Deprecated
    public void adiciona(Banho banho) {
        procedimentos.add(banho);
    }

    @Deprecated
    public void adiciona(Tosa tosa) {
        procedimentos.add(tosa);
    }

    @Deprecated
    public void adiciona(Checkup checkup) {
        procedimentos.add(checkup);
    }

    // AVISO: O dono da clínica falou que a ordem dos
    // procedimentos no relatório não importa. Para ele,
    // tanto faz estarem agrupados por tipo ou não.
    public void relata() {
        for (Procedimento procedimento : procedimentos) {
            IO.println(procedimento.getCliente().resume());
            IO.println(procedimento.getDescricao());
        }
    }

    public double fecha() {
        double s = 0;
        for (Procedimento procedimento : procedimentos) {
            double preco = procedimento.preco();
            if (procedimento.getCliente().isFiel()) {
                preco *= 1 - procedimento.desconto();
            }
            s += preco;
        }
        return s;
    }
}
