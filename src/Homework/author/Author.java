package Homework.author;

public class Author {
    private String name;
    private String surname;
    private String email;
    private int age;
    private String gender;

    Author() {
    }

    Author(String name, String surname,
           String email, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
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

    public void setAge(int value) {
        if (value <= 0)
            age = 1;
        age = value;
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

