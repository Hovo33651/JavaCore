package Homework.author;

public class AuthorStorage {

    private Author[] authorArray = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == authorArray.length)
            extend();
        authorArray[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authorArray.length + 10];
        for (int i = 0; i < authorArray.length; i++) {
            tmp[i] = authorArray[i];
        }
        authorArray = tmp;
    }

    Author getByIndex(int index) {
        if (index > authorArray.length - 1 || index < 0) {
            System.out.println("Invalid index");
            return null;
        }
        return authorArray[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authorArray[i]);

        }
    }

}
