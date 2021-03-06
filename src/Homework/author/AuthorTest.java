package Homework.author;

import java.util.Scanner;

public class AuthorTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOK_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";
    private static final String DELETE_BOOK = "12";
    private static final String DELETE_BOOK_BY_AUTHOR = "13";
    private static final String DELETE_AUTHOR = "14";


    public static void main(String[] args) {

        authorStorage.add(new Author("poxos", "poxosyan", 22, "poxos@mail.com", "male"));
        authorStorage.add(new Author("poxosuhi", "poxosyan", 23, "poxosuhi@mail.com", "female"));
        authorStorage.add(new Author("petros", "petrosyan", 25, "petros@mail.com", "male"));
        Author author1 = new Author("Poxos", "Poxosyan", 18, "poxos@mail.com", "male");
        Author author = new Author("Petros", "Petrosyan", 18, "poxos@mail.com", "male");
        bookStorage.add(new Book("samvel", "sdf", 7, 5, author));
        bookStorage.add(new Book("sdfsdf", "asdasd", 54, 54, author));
        bookStorage.add(new Book("sdfsdf", "asdasd", 54, 54, author));
        bookStorage.add(new Book("sdfsdf", "asdasd", 54, 54, author));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));
        bookStorage.add(new Book("sdfrgerg", "sdfseg", 845, 85, author1));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case DELETE_BOOK_BY_AUTHOR:
                    deleteBookByAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                default:
                    System.out.println("Invalid command!");

            }
        }
    }

    private static void deleteAuthor() {
        System.out.println("Please input author's email");
        String email = scanner.nextLine();
        authorStorage.deleteAuthor(email);
        bookStorage.deleteBookByAuthor(email);
    }

    private static void deleteBookByAuthor() {
        System.out.println("Please input author's email");
        String email = scanner.nextLine();
        bookStorage.deleteBookByAuthor(email);
        System.out.println("Books have been deleted");



    }

    private static void deleteBook() {
        System.out.println("Please input title of the book you want to delete");
        String title = scanner.nextLine();
        bookStorage.deleteBook(title);
    }

    private static void changeBookAuthor() {
        System.out.println("Please input the title of the book");
        String title = scanner.nextLine();
        Book book = bookStorage.searchByTitle(title);
        if (book != null) {
            System.out.println("Please input new authors email");
            String newEmail = scanner.nextLine();
            Author author = authorStorage.getByEmail(newEmail);
            if (author != null) {
                book.setAuthor(author);
                System.out.println("The author has been changed");
            } else {
                book.setAuthor(addAuthor());
            }
        } else {
            System.out.println("Book doesn't exist. Please add new book");
            addBook();
        }
    }

    private static void changeAuthor() {
        System.out.println("Please input author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("Please input new name");
            String name = scanner.nextLine();
            author.setName(name);
            System.out.println("Please input new surname");
            String surname = scanner.nextLine();
            author.setSurname(surname);
            System.out.println("Please input new age");
            int age = Integer.parseInt(scanner.nextLine());
            author.setAge(age);
            System.out.println("Please input new gender");
            String gender = scanner.nextLine();
            author.setGender(gender);
        } else {
            changeAuthor();
        }
    }

    private static void countBooksByAuthor() {
        System.out.println("Please input author's email");
        String email = scanner.nextLine();
        bookStorage.countByAutor(email);
    }

    private static void searchBookByAuthor() {
        System.out.println("Please input author's email");
        String email = scanner.nextLine();
        bookStorage.searchByAuthor(email);
    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);
    }

    private static void addBook() {

        System.out.println("please choose author's email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, author);

            bookStorage.add(book);

            System.out.println("Thank you, Book was added");
        } else {
            System.out.println("Author doesn't exist. Please add him.");
            Author newAuthor = addAuthor();
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, newAuthor);
            bookStorage.add(book);
        }

    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOK_BY_AUTHOR + " for search book by author");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for count author's books");
        System.out.println("please input " + CHANGE_AUTHOR + " to change author ");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " to change the author of book");
        System.out.println("please input " + DELETE_BOOK + " to delete a book");
        System.out.println("please input " + DELETE_BOOK_BY_AUTHOR + " to delete a book by author");
        System.out.println("please input " + DELETE_AUTHOR + " to delete author" + "\u001B[0m");
    }

    private static void searchByName() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static Author addAuthor() {
        System.out.println("Please input author's name");
        String name = scanner.nextLine();
        System.out.println("Please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input author's email");
        String email = scanner.nextLine();
        System.out.println("Please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("Please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);
        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exists");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you, author was added");
        }
        return author;

    }

}