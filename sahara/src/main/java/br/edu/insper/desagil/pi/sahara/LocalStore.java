package br.edu.insper.desagil.pi.sahara;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalStore extends Store {
    private Address address;
    private Map<String, Product> products;
    private Map<String, List<Double>> sales;

    public LocalStore(int id, String name, Address address, Map<String, Product> products) {
        super(id, name);
        this.address = address;
        this.products = products;
        this.sales = new HashMap<>();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void sell(Product product, double amount) {
        String code = product.getCode();

        List<Double> amounts = sales.get(code);
        if (amounts == null) {
            amounts = new ArrayList<>();
            sales.put(code, amounts);
        }

        amounts.add(amount);
    }

    @Override
    public double profit() {
        return revenue() - baseline();
    }

    private double revenue() {
        double s = 0;
        for (List<Double> amounts : sales.values()) {
            for (double d : amounts) {
                s += d;
            }
        }
        return s;
    }

    private double baseline() {
        double s = 0;
        for (String code : sales.keySet()) {
            s += products.get(code).getPrice() * sales.get(code).size();
        }
        return s;
    }
}
