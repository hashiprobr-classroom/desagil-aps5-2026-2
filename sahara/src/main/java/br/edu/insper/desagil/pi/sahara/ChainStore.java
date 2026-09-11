package br.edu.insper.desagil.pi.sahara;

import java.util.List;

public class ChainStore extends Store {
    private List<LocalStore> stores;

    public ChainStore(int id, String name, List<LocalStore> stores) {
        super(id, name);
        this.stores = stores;
    }

    @Override
    public double profit() {
        double s = 0;
        for (LocalStore store : stores) {
            s += store.profit();
        }
        return s;
    }
}
