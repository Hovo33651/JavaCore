package Homework.author;


import Chapter8.A;

public class AuthorStorage {


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
        System.out.println("Invalid email");
        return null;
    }

    public void deleteAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                deleteByindex(i);
                System.out.println("Author has been deleted");
            }
        }
    }

    private void deleteByindex(int index) {
        for (int i = index + 1; i < size; i++) {
            authors[i-1] = authors[i];
        }
        size--;
    }
}

