package Homework;

public class Homework1 {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println(" ");




        for (int i = 1; i < 5; i++) {
            for (int j = i - 2; j < 3; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("* ");

            }
            System.out.println("*");
        }
        System.out.println(" ");




       for (int i = 1; i < 5; i++) {
            for (int j = i - 1; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}







