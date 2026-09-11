package br.edu.insper.desagil.pi.sahara;

public class Product {
    private String code;
    private double price;

    public Product(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
