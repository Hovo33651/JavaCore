package newhomework.author;

import java.util.Arrays;

public class Author {
    private String nameSurname;
    private Book[] books;

    Author(){

    }
    Author(Book...books){
        this.books = books;
    }

    Author(String nameSurname, Book...books){
        this.nameSurname = nameSurname;
        this.books = books;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }


    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return  "Author: "+nameSurname + '\'' +
                 Arrays.toString(books);
    }
}
