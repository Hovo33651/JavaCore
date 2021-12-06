package education.commands;

public interface AdminCommands {
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String EXIT = "0";
    String ADD_LESSON_BY_STUDENT = "3";
    String PRINT_STUDENTS = "4";
    String PRINT_STUDENTS_BY_LESSON = "5";
    String PRINT_LESSONS = "6";
    String DELETE_LESSON_BY_NAME = "7";
    String DELETE_STUDENT_BY_EMAIL = "8";
    String DELETE_ACCOUNT = "9";

    static void printCommandsAdmin() {
        System.out.println("PRESS " + EXIT + " TO EXIT THE PROGRAM");
        System.out.println("PRESS " + ADD_LESSON + " TO ADD A LESSON");
        System.out.println("PRESS " + ADD_STUDENT + " TO ADD A STUDENT");
        System.out.println("PRESS " + ADD_LESSON_BY_STUDENT + " TO ADD A LESSON FOR YOUR STUDENT");
        System.out.println("PRESS " + PRINT_STUDENTS + " TO SEE ALL STUDENTS");
        System.out.println("PRESS " + PRINT_STUDENTS_BY_LESSON + " TO SEE STUDENTS BY LESSON");
        System.out.println("PRESS " + PRINT_LESSONS + " TO SEE ALL LESSONS");
        System.out.println("PRESS " + DELETE_LESSON_BY_NAME + " TO DELETE A LESSON");
        System.out.println("PRESS " + DELETE_STUDENT_BY_EMAIL + " TO DELETE A STUDENT");
        System.out.println("PRESS " + DELETE_ACCOUNT + " TO DELETE AN ACCOUNT");

    }
}

