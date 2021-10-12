package Homework.arrayutil;

public class NewEvenValuesArray {

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
        int[] evenNumbers = new int[array.length - oddNumber];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers[count] = array[i];
                count++;
            }
        }

        for (int i = 0; i < evenNumbers.length; i++) {
            if (i == 0) {
                System.out.print("evenNumber massive values are: ");
            }
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        int[] oddNumbers = new int[oddNumber];
        for (int i = 0; i < array.length; i++) {
            if (i==0){
                System.out.print("oddNumbers massive values are: ");
            }
            if(array[i] % 2 > 0){
                System.out.print(array[i] + " ");;
            }

        }


    }
    }
