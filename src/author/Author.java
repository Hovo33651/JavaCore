package author;

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

    public static String getName() {
        return name;
    }

    public static void setName(String name1) {
        name = name1;

    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname1) {
        surname = surname1;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email1) {
        email = email1;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age1) {
        age = age1;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender1) {
        gender = gender1;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
