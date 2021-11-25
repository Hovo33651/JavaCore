package Homework.author;



import Homework.author.Author;

public class BookStorage {

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

    public Book searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                return books[i];
            }
        }
        return null;
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
                System.out.print(books[i].getAuthor().getName());
            }
        }
        System.out.println(" has " + count + " books.");
    }


    public void deleteBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(title)) {
                deleteByIndex(i);
                System.out.println("The book has been deleted");
                break;
            } else {
                System.out.println("Invalid title");
            }
        }
    }


    private void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];

        }
        size--;
    }

    public void deleteBookByAuthor(String email) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getAuthor().getEmail().equals(email)) {
                deleteByIndex(i);
            }
        }
    }
}


    

