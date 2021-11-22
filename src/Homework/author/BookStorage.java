package Homework.author;

import java.util.Scanner;

import Homework.author.Author;

public class BookStorage {

    Scanner scanner = new Scanner(System.in);
    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email))
                System.out.println(books[i]);

        }
    }

    public void countByAutor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                count++;
            }
        }
        System.out.println("This author has " + count + " books.");
    }

    public void changeAuthor(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(title)) {
                System.out.println("Please input new author's email");
                String newEmail = scanner.nextLine();
                for (int j = 0; j < size; j++) {
                    if (books[j].getAuthor().getEmail().equals(newEmail)) {
                        books[i].setAuthor(books[j].getAuthor());
                        System.out.println("Thank you, book's author has been changed");
                    }
                }
            }
        }
    }
}