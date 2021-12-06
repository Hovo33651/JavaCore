package education.commands;

public interface UserCommands extends AdminCommands{
    static void printCommandsAdmin() {
        System.out.println("PRESS " + EXIT + " TO EXIT THE PROGRAM");
        System.out.println("PRESS " + ADD_LESSON + " TO ADD A LESSON");
        System.out.println("PRESS " + ADD_STUDENT + " TO ADD A STUDENT");
        System.out.println("PRESS " + ADD_LESSON_BY_STUDENT + " TO ADD A LESSON FOR YOUR STUDENT");
        System.out.println("PRESS " + PRINT_STUDENTS + " TO SEE ALL STUDENTS");
        System.out.println("PRESS " + PRINT_STUDENTS_BY_LESSON + " TO SEE STUDENTS BY LESSON");
        System.out.println("PRESS " + PRINT_LESSONS + " TO SEE ALL LESSONS");

    }
}


