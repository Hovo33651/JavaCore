package Homework;

public class FigurePainter {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*  ");
            }
            System.out.println("*");
        }
        System.out.println();


        for (int i = 1; i < 5; i++) {
            for (int j = i - 2; j < 3; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("* ");

            }
            System.out.println("*");
        }
        System.out.println();


        for (int i = 1; i < 5; i++) {
            for (int j = i - 1; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println();


        for (int i = 1; i < 8; i += 2) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i - 1; j < 6; j += 2) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println();


        for (int i = 1; i < 5; i++) {
            for (int j = i - 2; j < 3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("* ");

            }
            System.out.println("*");
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i - 1; j < 2; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println();


    }


}










