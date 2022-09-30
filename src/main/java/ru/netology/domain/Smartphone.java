package ru.netology.domain;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, int coste, String title, String manufacturer) {
        super(id, coste, title);
        this.manufacturer = manufacturer;
    }
}
