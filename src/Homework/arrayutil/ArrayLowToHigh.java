package Homework.arrayutil;

public class ArrayLowToHigh {
    public static void main(String[] args) {


        //Դասավորել մասսիվի թվերը փոքրից մեծ
        int[] array = {7, 4, 0, 2, 6, 37, 88, 12, 5};

        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}



    
