package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("book1", 100);
        Book book2 = new Book("book2", 200);
        Book book3 = new Book("book3", 300);
        Book book4 = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " are pages " + books[i].getPages());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " are pages " + books[i].getPages());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " are pages " + books[i].getPages());
            }
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if (!"Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " are pages " + books[i].getPages());
            }
        }
    }
}
