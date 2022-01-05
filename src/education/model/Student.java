package education.model;

import education.util.DateUtil;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Student implements Serializable {

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Lesson[] lessons;
    private Date birthday;

    public Student(String name, String surname,
                   String email, String phoneNumber, Lesson[] lessons, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lessons = lessons;
        this.birthday = birthday;
    }

    public Student() {

    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lessons) {
        for (int i = 0; i < lessons.length; i++) {
            if (lessons[i] != null)
                this.lessons = lessons;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lessons=" + Arrays.toString(lessons) +
                ", birthday=" + DateUtil.dateToString(birthday) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(email, student.email) && Objects.equals(phoneNumber, student.phoneNumber) && Arrays.equals(lessons, student.lessons) && Objects.equals(birthday, student.birthday);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, email, phoneNumber, birthday);
        result = 31 * result + Arrays.hashCode(lessons);
        return result;
    }
}

