package Homework.arrayutil;

public class NewEvenValuesArray {

    public static void main(String[] args) {

        int[] array = {70, 80, 65, 116, 258, 756, 115, 100};

        int oddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                oddNumbers++;
            }
        }


        int[] evenNumbers = new int[array.length - oddNumbers];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers[count] = array[i];
                count++;
            }

        }

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(evenNumbers[i] + " ");

        }


    }

}