package br.edu.insper.desagil.pi.sahara;

public class DebugStore extends Store {
    public DebugStore(int id, String name) {
        super(id, name);
    }

    @Override
    public double profit() {
        return 0;
    }
}
