package Chapter5;

public class BreakLoop3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 4; l++) {
                        for (int m = 0; m < 5; m++) {
                            System.out.print(m);
                        }
                        System.out.print(" ");

                    }
                    System.out.print(" ");
                }
                System.out.print(" ");
            }System.out.println();

        }

    }
}
