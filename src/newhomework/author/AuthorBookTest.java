package newhomework.author;

import Chapter8.A;

import java.util.Scanner;

public class AuthorBookTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();

    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_BOOKS = "2";
    private static final String PRINT_BOOKS_BY_AUTHOR = "3";
    private static final String CHANGE_AUTHOR = "4";


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_BOOKS_BY_AUTHOR:
                    printBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }


        }


    }

    private static void changeAuthor() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        Author author = authorStorage.getByTitle(title);
        if (author != null) {
            System.out.println("Write new name");
            String newName = scanner.nextLine();
            author.setNameSurname(newName);
            System.out.println("Author's name has been changed");

        }
    }



    private static void addBook() {
        System.out.println("Please input author's name and surname");
        String nameSurname = scanner.nextLine();
        Author author = authorStorage.getByNameSurname(nameSurname);
        if (author != null) {
            System.out.println("Please input book title");
            String title = scanner.nextLine();
            System.out.println("Please input book price");
            double price = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, price);
            author = new Author(nameSurname, book);
            authorStorage.add(author);
        } else {
            System.out.println("Please add author's book title");
            String title = scanner.nextLine();
            System.out.println("Please input the price of the book");
            double price = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, price);
            Author newAuthor = new Author(nameSurname, book);
            authorStorage.add(newAuthor);
        }

    }


    private static void printBooksByAuthor() {
        System.out.println("Please input author's name and surname");
        String nameSurname = scanner.nextLine();
        authorStorage.searchByAuthor(nameSurname);

    }

    private static void printBooks() {
        authorStorage.print();
    }


    private static void printCommands() {
        System.out.println("Press " + EXIT + " to exit the program");
        System.out.println("Press " + ADD_BOOK + " to add a book");
        System.out.println("Press " + PRINT_BOOKS + " to print books");
        System.out.println("Press " + PRINT_BOOKS_BY_AUTHOR + " to print books by author");
        System.out.println("Press " + CHANGE_AUTHOR + " to change author of book");

    }

}
