package Homework.author;
import java.util.Scanner;

public class AuthorStorage {

    Scanner scanner = new Scanner(System.in);
    private Author[] authors = new Author[16];
    private int size;

    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public void changeAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if(authors[i].getEmail().equals(email)){
                System.out.println("Please input author's name");
                String name = scanner.nextLine();
                authors[i].setName(name);
                System.out.println("Please input author's surname");
                String surname = scanner.nextLine();
                authors[i].setSurname(surname);
                System.out.println("Please input author's age");
                int age = Integer.parseInt(scanner.nextLine());
                authors[i].setAge(age);
                System.out.println("Please input author's gender");
                String gender = scanner.nextLine();
                authors[i].setGender(gender);
                System.out.println("Author has been changed");
                break;
            }else{
                System.err.println("Invalid email");
                break;
            }
        }



    }
}