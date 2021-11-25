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
                    System.err.println("INVALID COMMAND");
                    break;
            }


        }


    }

    private static void changeAuthor() {
        System.out.println("\u001B[34m" + "PLEASE INPUT THE TITLE OF THE BOOK" + "\u001B[34m");
        String title = scanner.nextLine();
        Author author = authorStorage.getByTitle(title);
        if (author != null) {
            System.out.println("\u001B[34m" + "WRITE A NEW NAME" + "\u001B[34m");
            String newName = scanner.nextLine();
            author.setNameSurname(newName);
            System.out.println("\u001B[34m" + "AUTHOR'S NAME HAS BEEN CHANGED" + "\u001B[34m");

        }
    }



    private static void addBook() {
        System.out.println("\u001B[34m" + "PLEASE INPUT AUTHOR'S NAME AND SURNAME" + "\u001B[34m");
        String nameSurname = scanner.nextLine();
        Author author = authorStorage.getByNameSurname(nameSurname);
        if (author != null) {
            System.out.println("\u001B[34m" + "PLEASE INPUT THE TITLE OF THE BOOK" + "\u001B[34m");
            String title = scanner.nextLine();
            System.out.println("\u001B[34m" + "PLEASE INPUT THE PRICE OF THE BOOK" + "\u001B[34m");
            double price = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, price);
            author = new Author(nameSurname, book);
            authorStorage.add(author);
        } else {
            System.out.println("\u001B[34m" + "PLEASE INPUT THE TITLE OF THE BOOK" + "\u001B[34m");
            String title = scanner.nextLine();
            System.out.println("\u001B[34m" + "PLEASE INPUT THE PRICE OF THE BOOK" + "\u001B[34m");
            double price = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, price);
            Author newAuthor = new Author(nameSurname, book);
            authorStorage.add(newAuthor);
        }

    }


    private static void printBooksByAuthor() {
        System.out.println("\u001B[34m" + "PLEASE INPUT AUTHOR'S NAME AND SURNAME" + "\u001B[34m");
        String nameSurname = scanner.nextLine();
        authorStorage.searchByAuthor(nameSurname);

    }

    private static void printBooks() {
        authorStorage.print();
    }


    private static void printCommands() {
        System.out.println("\u001B[34m"+"PRESS " + EXIT + " TO EXIT THE PROGRAM");
        System.out.println("PRESS " + ADD_BOOK + " TO ADD A BOOK");
        System.out.println("PRESS " + PRINT_BOOKS + " TO PRINT ALL BOOKS");
        System.out.println("PRESS " + PRINT_BOOKS_BY_AUTHOR + " TO PRINT YOUR FAVORITE AUTHOR'S BOOKS");
        System.out.println("PRESS " + CHANGE_AUTHOR + " TO CHANGE THE AUTHOR OF BOOK"+"\u001B[34m");

    }

}
