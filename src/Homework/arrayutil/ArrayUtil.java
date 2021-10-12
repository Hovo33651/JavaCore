package Homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {5, 7, 8, 11, 14, 80, 3, 2, 4, 15,};


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();


        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("massive max value is: " + maxValue);


        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("massive min value is: " + minValue);


        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("massive even numbers are: " + " ");
            }
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("massive odd numbers are: " + " ");
            }
            if (array[i] % 2 > 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("the number of even values is: " + evenCount);

        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                oddCount++;
            }
        }
        System.out.println("the number of odd values is: " + oddCount);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("massive values sum is: " + sum);
        double average = (double) sum / array.length;
        System.out.println("massive values arithmetic average is: " + average);

    }
}
