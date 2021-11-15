package Homework.author;

public class Author {
    private static String name;
    private static String surname;
    private static String email;
    private static int age;
    private static String gender;

    Author() {
    }

    Author(String name1, String surname1,
           String email1, int age1, String gender1) {
        age = age1;
        name = name1;
        surname = surname1;
        email = email1;
        gender = gender1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name1;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname1) {
        surname = surname1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email1) {
        email = email1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        age = age1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender1) {
        gender = gender1;
    }


    @Override
    public String toString() {
        return "Name Surname \n" + name + " " + surname + "\nage\n" + age + "\nemail\n" + email + "\ngender\n" + gender;
    }
}


