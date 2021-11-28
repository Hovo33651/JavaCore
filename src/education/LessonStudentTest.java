package education;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class LessonStudentTest {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.out.println("GOOD BYE!!!");
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("INVALID COMMAND");
            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("PLEASE INPUT STUDENT'S EMAIL");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if(student != null){
            studentStorage.deleteByEmail(email);
            System.out.println("STUDENT HAS BEEN DELETED");
        }
        else System.out.println("STUDENT DOESN'T EXIST");
    }

    private static void deleteLessonByName() {
        System.out.println("PLEASE INPUT THE NAME OF THE LESSON");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if(lesson != null){
            lessonStorage.deleteByName(name);
            System.out.println("THE LESSON HAS BEEN DELETED");
        }else{
            System.out.println("THE LESSON DOESN'T EXIST");
        }
    }

    private static void printStudentsByLesson() {
        System.out.println("PLEASE INPUT THE NAME OF THE LESSON");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if(lesson != null){
            studentStorage.printByLesson(name);
        }
        else{
            System.out.println("THE LESSON DOESN'T EXIST");
        }
    }

    private static void addStudent() {
        System.out.println("PLEASE, INPUT STUDENT'S NAME");
        String name = scanner.nextLine();
        System.out.println("PLEASE, INPUT STUDENT'S SURNAME");
        String surname = scanner.nextLine();
        System.out.println("PLEASE, INPUT STUDENT'S AGE");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("PLEASE, INPUT STUDENT'S EMAIL");
        String email = scanner.nextLine();
        System.out.println("PLEASE, INPUT STUDENT'S PHONE NUMBER");
        String phoneNumber = scanner.nextLine();
        System.out.println("PLEASE, INPUT THE LESSON YOU WANT");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonName);
        if(lesson != null){
            Student student = new Student(name, surname,age,email,phoneNumber,lesson);
            studentStorage.add(student);
        }
        else{
            System.out.println("THE LESSON DOESN'T EXIST");

        }

    }

    private static void addLesson() {
        System.out.println("PLEASE, INPUT NEW LESSON NAME");
        String name = scanner.nextLine();
        System.out.println("PLEASE, INPUT THE DURATION OF THE LESSON");
        String duration = scanner.nextLine();
        System.out.println("PLEASE, INPUT THE NAME OF THE LECTURER");
        String lecturerName = scanner.nextLine();
        System.out.println("PLEASE, INPUT THE PRICE OF THE LESSON");
        double price = Integer.parseInt(scanner.nextLine());
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson == null) {
            Lesson newLesson = new Lesson(name, duration, lecturerName, price);
            lessonStorage.add(newLesson);
            System.out.println("THANK YOU, THE LESSON IS ADDED");
        }
        else{
            System.out.println("THIS LESSON ALREADY EXISTS");
        }
    }

    private static void printCommands() {
        System.out.println("PRESS " + EXIT + " TO EXIT THE PROGRAM");
        System.out.println("PRESS " + ADD_LESSON + " TO ADD A LESSON");
        System.out.println("PRESS " + ADD_STUDENT + " TO ADD A STUDENT");
        System.out.println("PRESS " + PRINT_STUDENTS + " TO SEE ALL STUDENTS");
        System.out.println("PRESS " + PRINT_STUDENTS_BY_LESSON + " TO SEE STUDENTS BY LESSON");
        System.out.println("PRESS " + PRINT_LESSONS + " TO SEE ALL LESSONS");
        System.out.println("PRESS " + DELETE_LESSON_BY_NAME + " TO DELETE A LESSON");
        System.out.println("PRESS " + DELETE_STUDENT_BY_EMAIL + " TO DELETE A STUDENT");

    }

}