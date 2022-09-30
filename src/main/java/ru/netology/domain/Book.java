package ru.netology.domain;

public class Book extends Product{
    private String author;

    public Book (int id, int coste, String title, String author) {
        super (id, coste, title);
        this.author=author;
    }
}
