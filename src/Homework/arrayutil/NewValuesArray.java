package Homework.arrayutil;

public class NewValuesArray {

    public static void main(String[] args) {

        int[] array = {70, 80, 65, 116, 258, 756, 115, 100};

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("array massive values are: ");
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int oddNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                oddNumber++;
            }
        }
        int[] evenNumbersArray = new int[array.length - oddNumber];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersArray[count] = array[i];
                count++;
            }
        }

        for (int i = 0; i < evenNumbersArray.length; i++) {
            if (i == 0) {
                System.out.print("evenNumbersArray values are: ");
            }
            System.out.print(evenNumbersArray[i] + " ");
        }
        System.out.println();

        int[] oddNumbersArray = new int[oddNumber];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("oddNumbersArray values are: ");
            }
            if (array[i] % 2 > 0) {
                System.out.print(array[i] + " ");
                ;
            }

        }


    }
}
