package author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AuthorStorage authorStorage = new AuthorStorage();

        System.out.println("How many people would you like do add");
        int j = sc.nextInt();
        for (int i = 0; i < j; i++) {
            System.out.println("name");
            String name = sc.next();
            Author.setName(name);
            System.out.println("surname");
            String surname = sc.next();
            Author.setSurname(name);
            System.out.println("age");
            int age = sc.nextInt();
            Author.setAge(age);
            System.out.println("email");
            String email = sc.next();
            Author.setEmail(email);
            System.out.println("gender");
            String gender = sc.next();
            Author.setGender(gender);

            String getName = Author.getName();
            String getSurname = Author.getSurname();
            String getEmail = Author.getEmail();
            int getAge = Author.getAge();
            String getGender = Author.getGender();

            Author author = new Author(getName, getSurname, getEmail, getAge, getGender);

            authorStorage.add(author);
        }

        authorStorage.print();
    }
}