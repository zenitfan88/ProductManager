package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestManager {
    Book book1 = new Book(101, 1000, "Thriller", "King");
    Book book2 = new Book(212, 2347, "Driama", "Tolkien");
    Smartphone smart1 = new Smartphone(323, 6899, "Geriakl", "Nokia");
    Smartphone smart2 = new Smartphone(526, 10793, "Heriasima", "Readmi");


    @Test
    public void deleteId() {
        ProductManger manager = new ProductManger();
        manager.add(book1);
        manager.add(book2);
        manager.add(smart1);
        manager.add(smart2);

        assertThrows(NotFoundException.class, () -> {
            manager.removeById(222);
        });

        Product[] actual = manager.removeById(323);
        Product[] expected = {book1, book2, smart2};
        Assertions.assertArrayEquals(actual, expected);
    }
}

