package br.edu.insper.desagil.pi.catz;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private List<Banho> banhos;
    private List<Tosa> tosas;
    private List<Checkup> checkups;

    public Caixa() {
        this.banhos = new ArrayList<>();
        this.tosas = new ArrayList<>();
        this.checkups = new ArrayList<>();
    }

    public void adiciona(Banho banho) {
        banhos.add(banho);
    }

    public void adiciona(Tosa tosa) {
        tosas.add(tosa);
    }

    public void adiciona(Checkup checkup) {
        checkups.add(checkup);
    }

    // AVISO: O dono da clínica falou que a ordem dos
    // procedimentos no relatório não importa. Para ele,
    // tanto faz estarem agrupados por tipo ou não.
    public void relata() {
        for (Checkup checkup : checkups) {
            IO.println(checkup.getCliente().resume());
            IO.println(checkup.getDescricao());
        }
        for (Banho banho : banhos) {
            IO.println(banho.getCliente().resume());
            IO.println(banho.getDescricao());
        }
        for (Tosa tosa : tosas) {
            IO.println(tosa.getCliente().resume());
            IO.println(tosa.getDescricao());
        }
    }

    public double fecha() {
        double s = 0;
        for (Banho banho : banhos) {
            double preco = 74.90;
            if (banho.getCliente().isFiel()) {
                preco *= 0.85;
            }
            s += preco;
        }
        for (Tosa tosa : tosas) {
            double preco = 88.50;
            if (tosa.getCliente().isFiel()) {
                preco *= 0.9;
            }
            s += preco;
        }
        for (Checkup checkup : checkups) {
            double preco = 275.00;
            if (checkup.getCliente().isFiel()) {
                preco *= 0.95;
            }
            s += preco;
        }
        return s;
    }
}
