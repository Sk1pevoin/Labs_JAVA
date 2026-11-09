package org.example;

import java.time.Year;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public boolean isOld() {
        int currentYear = Year.now().getValue();
        return (currentYear - this.year) > 50;
    }

    @Override
    public String toString() {
        return "Книга: \"" + title + "\", Автор: " + author + ", Год: " + year;
    }
}
