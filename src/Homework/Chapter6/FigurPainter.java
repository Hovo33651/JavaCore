package Homework.Chapter6;

public class FigurPainter {

    void fp1 (){
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*  ");
            }
            System.out.println("*");
        }
        System.out.println();
    }
    void fp2(){
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
    }
    void fp3(){
        for (int i = 1; i < 5; i++) {
            for (int j = i - 1; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println();
    }
    void fp4(){
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
    }
    void fp5(){
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
