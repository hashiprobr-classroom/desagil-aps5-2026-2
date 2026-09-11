package br.edu.insper.desagil.pi.sahara;

public abstract class Store {
    private int id;
    private String name;

    public Store(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double profit();
}
