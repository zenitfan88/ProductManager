package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManager {
    Book book1 = new Book(101, 1000, "Thriller", "King");
    Book book2 = new Book(212, 2347, "Driama", "Tolkien");
    Smartphone smart1 = new Smartphone(323, 6899, "Geriakl", "Nokia");
    Smartphone smart2 = new Smartphone(526, 10793, "Heriasima", "Readmi");

    @Test
    public void addAll() {
        ProductManger manager = new ProductManger();
        manager.add(book1);
        manager.add(book2);
        manager.add(smart1);
        manager.add(smart2);

        Product[] actual = manager.findAll();
        Product[] expected = {book1, book2, smart1, smart2};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void addNull() {
        ProductManger manager = new ProductManger();

        Product[] actual = manager.findAll();
        Product[] expected = {};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void addSeveral() {
        ProductManger manager = new ProductManger();
        manager.add(book1);
        manager.add(smart1);

        Product[] actual = manager.findAll();
        Product[] expected = {book1, smart1};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void deleteId() {
        ProductManger manager = new ProductManger();
        manager.add(book1);
        manager.add(book2);
        manager.add(smart1);
        manager.add(smart2);

        Product[] actual = manager.removeByID(323);
        Product[] expected = {book1, book2, smart2};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void searchByAll() {
        ProductManger manager = new ProductManger();
        manager.add(book1);
        manager.add(book2);
        manager.add(smart1);
        manager.add(smart2);

        Product[] actual = manager.searchBy("ri");
        Product[] expected = {book1, book2, smart1, smart2};
        Assertions.assertArrayEquals(actual, expected);

        Product[] actual1 = manager.searchBy("a");
        Product[] expected1 = {book2, smart1, smart2};
        Assertions.assertArrayEquals(actual1, expected1);

        Product[] actual2 = manager.searchBy("qw");
        Product[] expected2 = {};
        Assertions.assertArrayEquals(actual2, expected2);
    }
}

