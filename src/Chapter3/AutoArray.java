package Chapter3;

public class AutoArray {
    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
                31};
        System.out.println("April has " + monthDays[3] + " days");
        for (int i = 0; i < 10; i++) {
            System.out.print(monthDays[i] + " ");
        }
    }


}