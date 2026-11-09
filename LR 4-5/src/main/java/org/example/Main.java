package org.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1967);
        Book book2 = new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 1997);
        Book book3 = new Book("Преступление и наказание", "Федор Достоевский", 1866);

        Book[] books = {book1, book2, book3};

        System.out.println("Старые книги (старше 50 лет):");
        for (Book book : books) {
            if (book.isOld()) {
                System.out.println(book);
            }
        }
    }
}