package Homework.lesson12;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String lessonName;

    public Student(String name, String surname, int age, String phoneNumber, String lessonName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.lessonName = lessonName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
