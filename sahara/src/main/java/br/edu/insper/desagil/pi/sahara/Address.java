package br.edu.insper.desagil.pi.sahara;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private int number;
    private String street;
    private String complement;
    private String zipCode;

    public Address(int number, String street, String complement, String zipCode) {
        this.number = number;
        this.street = street;
        this.complement = complement;
        this.zipCode = zipCode;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getComplement() {
        return complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public List<String> asList() {
        List<String> l = new ArrayList<>();
        l.add(Integer.toString(number));
        l.add(street);
        if (complement != null) {
            l.add(complement);
        }
        l.add(zipCode);
        return l;
    }
}
