package Homework.arrayutil;

public class Array {

    public static void main(String[] args) {

        int[] array = {70, 80, 65, 115, 100};

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("massive even values are: ");
            }
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                index = i;

            }
        }
        System.out.println();
        System.out.println("last even value is: " + array[index]);

    }
}
