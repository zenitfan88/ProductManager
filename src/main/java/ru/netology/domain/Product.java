package ru.netology.domain;

import java.util.Collection;

public class Product {
    protected int id;
    protected String title;
    protected int coste;

    public Product(int id, int coste, String title) {
        this.id = id;
        this.coste = coste;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


}
