package org.ucode.lecture12.examples.books;

public class KindleBook extends Book implements GenericBook, AnotherGenericBook {
    public KindleBook(String isbn) {
        super(isbn);
    }
}
