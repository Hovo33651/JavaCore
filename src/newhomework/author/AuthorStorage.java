package newhomework.author;


import java.util.Arrays;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size = 0;

    public Author add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
        return author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void searchByAuthor(String name) {
        for (int i = 0; i < size; i++) {
            if(authors[i].getNameSurname().contains(name)){
                System.out.println(Arrays.toString(authors[i].getBooks()));
            }
        }
    }

    public Author getByTitle(String title){
        for (int i = 0; i < size; i++) {
            if(Arrays.toString(authors[i].getBooks()).contains(title)){
                return authors[i];
            }
        }return null;
    }

    public Author getByNameSurname(String nameSurname){
        for (int i = 0; i < size; i++) {
            if(authors[i].getNameSurname().contains(nameSurname))
                return authors[i];
        }
        return null;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i].getNameSurname() + " " + Arrays.toString(authors[i].getBooks()));

        }
    }
}
