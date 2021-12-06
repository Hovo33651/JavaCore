package education;

import education.commands.GeneralCommands;
import education.commands.AdminCommands;
import education.commands.UserCommands;
import education.model.Lesson;
import education.model.Student;
import education.model.User;
import education.storages.LessonStorage;
import education.storages.StudentStorage;
import education.storages.UserStorage;
import education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LessonStudentTest implements AdminCommands, GeneralCommands, UserCommands {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static boolean isRun = true;
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) throws ParseException {

        while (isRun) {
            GeneralCommands.commands();
            String command = scanner.nextLine();
            switch (command) {
                case LOG_IN:
                    logIn();
                    break;
                case REGISTER:
                    addUser();
                    break;
                case EXIT:
                    isRun = false;
                    break;
                default:
                    System.out.println("INVALID COMMAND");
            }
        }
    }

    private static void addUser() throws ParseException {
        System.out.println("PLEASE INPUT YOUR NAME");
        String name = scanner.nextLine();
        System.out.println("PLEASE INPUT YOUR SURNAME");
        String surname = scanner.nextLine();
        System.out.println("PLEASE INPUT YOUR EMAIL");
        String email = scanner.nextLine();
        System.out.println("PLEASE INPUT YOUR PASSWORD");
        String password = scanner.nextLine();
        System.out.println("ADMIN OR USER");
        String type = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        if (user == null) {
            if (type.equals("admin") || type.equals("user")) {
                User newUser = new User(name, surname, email, password, type);
                userStorage.add(newUser);
                System.out.println("THANK YOU, YOU ARE REGISTERED");

            } else {
                System.out.println("WRONG TYPE! SHOULD BE ADMIN OR USER");
            }
        } else
            System.out.println("USER WITH THIS EMAIL ALREADY EXISTS");
    }

    private static void adminMethods() throws ParseException {
        while (isRun) {
            AdminCommands.printCommandsAdmin();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    return;
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
                case ADD_LESSON_BY_STUDENT:
                    addLessonByStudent();
                    break;
                default:
                    System.out.println("INVALID COMMAND");

            }
        }
    }

    private static void userMethods() throws ParseException {
        while (isRun) {
            UserCommands.printCommandsAdmin();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.out.println("GOOD BYE!!!");
                    return;
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
                case ADD_LESSON_BY_STUDENT:
                    addLessonByStudent();
                    break;
                default:
                    System.out.println("INVALID COMMAND");

            }
        }
    }

    private static void logIn() throws ParseException {
        System.out.println("PLEASE INPUT YOUR EMAIL TO LOG IN");
        String email = scanner.nextLine();
        System.out.println("PLEASE INPUT YOUR PASSWORD");
        String password = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        if (user != null && user.getPassword().equals(password) && user.getType().equals("admin")) {
            adminMethods();
        } else if (user != null && user.getPassword().equals(password) && user.getType().equals("user")) {
            userMethods();
        } else if (user != null && !user.getPassword().equals(password)) {
            System.out.println("INVALID PASSWORD!");
        } else {
            System.out.println("USER DOESN'T EXIST");
        }
    }


    private static void addLessonByStudent() {
        System.out.println("PLEASE, INPUT YOUR STUDENT'S EMAIL");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            System.out.println("PLEASE, INPUT THE LESSON YOU WANT TO ADD");
            String name = scanner.nextLine();
            String[] lessonNames = name.split(",");
            Lesson[] lessons = new Lesson[lessonNames.length];
            for (int i = 0; i < lessons.length; i++) {
                if (lessonStorage.getByName(lessonNames[i]) != null) {
                    lessons[i] = lessonStorage.getByName(lessonNames[i]);
                } else {
                    System.out.println("THE LESSON DOESN'T EXIST");
                }
            }
            student.setLessons(lessons);
            System.out.println("THE LESSON IS ADDED");
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("PLEASE INPUT STUDENT'S EMAIL");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deleteByEmail(email);
            System.out.println("STUDENT HAS BEEN DELETED");
        } else System.out.println("STUDENT DOESN'T EXIST");
    }

    private static void deleteLessonByName() {
        System.out.println("PLEASE INPUT THE NAME OF THE LESSON");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteByName(name);
            System.out.println("THE LESSON HAS BEEN DELETED");
        } else {
            System.out.println("THE LESSON DOESN'T EXIST");
        }
    }

    private static void printStudentsByLesson() {
        System.out.println("PLEASE INPUT THE NAME OF THE LESSON");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            studentStorage.printByLesson(name);
        } else {
            System.out.println("THE LESSON DOESN'T EXIST");
        }
    }

    private static void addStudent() throws ParseException {
        System.out.println("PLEASE, INPUT STUDENT'S NAME");
        String name = scanner.nextLine();
        System.out.println("PLEASE, INPUT STUDENT'S SURNAME");
        String surname = scanner.nextLine();
        System.out.println("PLEASE, INPUT STUDENT'S EMAIL");
        String email = scanner.nextLine();
        System.out.println("PLEASE, INPUT STUDENT'S PHONE NUMBER");
        String phoneNumber = scanner.nextLine();
        System.out.println("PLEASE, INPUT AUTHOR'S DATE OF BIRTH XX/XX/XXXX");
        String birthday = scanner.nextLine();
        Date date = DateUtil.stringToDate(birthday);
        System.out.println("PLEASE, INPUT THE LESSON YOU WANT");
        String lessonName = scanner.nextLine();
        String[] lessonNames = lessonName.split(",");
        Lesson[] lessons = new Lesson[lessonNames.length];
        for (int i = 0; i < lessons.length; i++) {
            if (lessonStorage.getByName(lessonNames[i]) != null) {
                lessons[i] = lessonStorage.getByName(lessonNames[i]);
            } else {
                System.out.println("THE LESSON " + lessonNames[i] + " DOESN'T EXIST");
            }
        }
        Student student = new Student(name, surname, email, phoneNumber, lessons, date);
        studentStorage.add(student);
        System.out.println("THANK YOU, STUDENT IS ADDED");
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
        } else {
            System.out.println("THIS LESSON ALREADY EXISTS");
        }
    }
}