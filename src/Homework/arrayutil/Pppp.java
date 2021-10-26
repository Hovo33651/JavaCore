package Homework.arrayutil;

public class Pppp {

    public static void main(String[] args) {

        int[] array = {7, 5, 5, 4, 4, 0, 8, 2, 8, 6, 5};

        //գտնել մասիվի կրկնվող էլէմենտները
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    System.out.print(array[j] + "-ը կրկնվում է" + "\n");
                    break;
                }
            }
        }
        boolean even = false;
        int evenNumbers = 0;
        for (int i = 0; i < array.length-1; i++) {
                if (array[i] % 2 ==0) {
                    evenNumbers++;
                }
            }
        if(evenNumbers == array.length){
            even = true;
        }
        System.out.println(even);






    }
}
