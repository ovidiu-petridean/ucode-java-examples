package org.ucode.lecture12.examples.books;

public abstract class Book {

    private String isbn;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
