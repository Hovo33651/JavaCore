package Homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();
        System.out.println("How many authors would you like do add");
        int j = sc.nextInt();

        for (int i = 0; i < j; i++) {
            Author author = new Author();

            System.out.println("name");
            String name = sc.next();
            author.setName(name);

            System.out.println("surname");
            String surname = sc.next();
            author.setSurname(surname);

            System.out.println("age");
            int age = sc.nextInt();
            author.setAge(age);

            System.out.println("email");
            String email = sc.next();
            author.setEmail(email);

            System.out.println("gender");
            String gender = sc.next();
            author.setGender(gender);


            authorStorage.add(author);
        }
        authorStorage.print();

    }
}