package Homework.lesson12;


import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your name");
        String name = scan.next();
        System.out.println("Write your surname");
        String surname = scan.next();
        System.out.println("Write your age");
        int age = scan.nextInt();
        System.out.println("Write your phone number");
        String phone = scan.next();
        System.out.println("Write the lesson you want");
        String lesson = scan.next();

        Student student = new Student(name, surname, age, phone, lesson);


    }
}
